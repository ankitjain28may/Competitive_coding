# The Wars to Come

# https://www.hackerearth.com/problem/algorithm/the-wars-to-come-7/

t=int(raw_input())
a=[]
a=map(int,raw_input().split())
m=int(raw_input())
a.sort()
c=0
x=t-1
while c<m:
    c=c+a[x]
    x=x-1
print (t-x-1)