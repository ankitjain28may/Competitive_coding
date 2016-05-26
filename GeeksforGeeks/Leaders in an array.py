# Leaders in an array
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=623


t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    a=[]
    a=map(int,raw_input().split())
    s=""
    for j in range(0,n-1):
        if a[j]>max(a[j+1:]):
            s=s+str(a[j])+" "
    s=s+str(a[n-1])
    print s
