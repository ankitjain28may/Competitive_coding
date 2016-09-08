# Circular Array Rotation
# https://www.hackerrank.com/challenges/circular-array-rotation

class queue:
    def __init__(self):
        self.front = -1
        self.rear = -1
        self.a=[]

    def pop(self):
        d = self.a[self.front]
        if self.front == self.rear :
            self.front=-1
            self.rear=-1
        else:
            self.front+=1
        return d

    def push(self, ele):
        if self.rear == self.front and self.rear == -1:
            self.front+=1
        self.a.append(ele)
        self.rear+=1


    def display(self,pos):
        print self.a[self.rear-pos]



n, k, q = map(int, raw_input().split())
arr = map(int, raw_input().split())
ob = queue()
arr.reverse()
for i in arr:
    ob.push(i)
for j in range(k):
    ob.push(ob.pop())
for i in range(q):
    x=int(raw_input())
    ob.display(x)

