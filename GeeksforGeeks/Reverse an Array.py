# Reverse an Array
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=78



t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    a=[]
    a=map(int,raw_input().split())
    s=""
    j=int(n-1)
    while j>=0:
        s=s+str(a[j])+" "
        j-=1
    print s
