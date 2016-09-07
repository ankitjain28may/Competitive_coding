# Maximum Element
# https://www.hackerrank.com/challenges/maximum-element/

class stack:
    def __init__(self):
        self.top=-1
        self.a=[]
        
    def push(self,ele):
        self.a.append(ele)
        self.top+=1
        
    def pop(self):
        self.a.pop()
        self.top-=1
        
    def pri(self):
        print self.a[self.top]
        
    def peek(self):
        return self.a[self.top]

    def toop(self):
        return self.top
        
n = int(raw_input())
ob = stack()
ob1 = stack()
for i in range(n):
    q = map(int,raw_input().split())
    if q[0] == 1:
        ob.push(q[1])
        if ob1.toop() == -1:
            ob1.push(q[1])
        elif ob1.peek() <= q[1]:
            ob1.push(q[1])
    elif q[0] == 2:
        if ob.peek() == ob1.peek():
            ob1.pop()
        ob.pop()
    else:
        ob1.pri()
        
        
    