# Simple Text Editor
# https://www.hackerrank.com/challenges/simple-text-editor/

class stack:
    def __init__(self):
        self.top=0
        self.a=[""]
        self.s=""
        
    def push(self,ele):
        self.s=self.s+ele
        self.a.append(self.s)
        self.top+=1

        
    def pop(self):
        self.a.pop()
        self.top-=1
        self.s=self.a[self.top]
        
    def delete(self,remove):
        self.s=self.s[:-remove]
        self.a.append(self.s)
        self.top+=1
        
    
    def display(self,pos):
        print self.s[pos-1]

        
n=int(raw_input())
ob = stack()
for i in range(n):
    q=raw_input().split()
    if q[0] == '1':
        ob.push(q[1])
    elif q[0] == '2':
        ob.delete(int(q[1]))
    elif q[0] == '3':
        ob.display(int(q[1]))
    else:
        ob.pop()
        