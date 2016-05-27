t=int(raw_input())
for j in range(t):
    n=int(raw_input())
    a=[]
    a=map(int,raw_input().split())
    b=[]
    s=int(0)
    b=b+[s]
    for i in a:
        s=s+i
        b=b+[s]
    ma=int(-10000000000)
    st=int(0)
    en=int(0)
    i=int(0)
    for i in range(0,n):
        for k in range(i,n+1):
            if k==0:
                ma=b[1]
                st=0
                en=0
            elif b[k]-b[i]>ma and k!=1:
                ma=b[k]-b[i]
                st=i
                en=k
    mi=int(min(a[st:en+1]))
    if ma+a[st-1]-mi>ma and st-1>=0 and st!=en:
        print ma+s[st-1]-mi
    elif en+1<n and ma+a[en+1]-mi>ma and st!=en:
        print ma+s[en+1]-mi
    else:
        print ma