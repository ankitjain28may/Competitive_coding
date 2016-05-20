 # Sports Trophy

 # https://www.hackerearth.com/problem/algorithm/interstellar/\


t=int(raw_input())
for i in range(0,t):
    n,k=map(int,raw_input().split())
    a=[]
    a=map(int,raw_input().split())
    l=len(a)
    s=0
    for j in a:
        s=s+j
    if((s/l)>=k):
        print "Yes"
    else:
        print "No"
