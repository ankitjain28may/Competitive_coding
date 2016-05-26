# Swap kth node
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=535



t=int(raw_input())
for i in range(t):
    n,k=map(int,raw_input().split())
    a=[]
    a=map(int,raw_input().split())
    a[k-1],a[n-k]=a[n-k],a[k-1]
    s=""
    for j in a:
        s=s+str(j)+" "
    print s
    
