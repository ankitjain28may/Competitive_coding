# https://www.hackerrank.com/challenges/balanced-brackets
# Balanced Brackets

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
        
    def peek(self):
        return self.a[self.top]
    
    def precedence(self,ele):
        if ele == '[' or ele == ']':
            return 1
        elif ele == '{' or ele == '}':
            return 2
        elif ele == '(' or ele == ')':
            return 3
    def length(self):
        return self.top
        
n=int(raw_input())

for i in range(n):
    ob = stack()
    q=raw_input()
    flag = 0
    for j in q:
        if j == '{' or j == '[' or j == '(':
            ob.push(j)
        else:
            if ob.length() == -1:
                flag = 1
                break
            elif ob.precedence(ob.peek()) == ob.precedence(j):
                ob.pop()
            else :
                flag = 1
                break
    if flag == 1 or ob.length() > -1:
        print "NO"
    else :
        print "YES"