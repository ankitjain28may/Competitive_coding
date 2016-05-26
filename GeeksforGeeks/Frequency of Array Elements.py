# Frequency of Array Elements
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=84

t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    a=[]
    a=map(int,raw_input().split())
    b=[]
    s=int(0)
    for j in range(0,n):
        s=int(0)
        if j+1 in a:
            for k in a:
                if k==j+1:
                    s+=1
            b=b+[s]
        else:
            b=b+[0]
    s=""
    for j in b:
        s=s+str(j)+" "
    print s
