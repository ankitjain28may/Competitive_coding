# Value equal to index value
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=473


t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    a=[]
    a=map(int,raw_input().split())
    s=""
    flag=int(0)
    for j in range(0,n):
        if (j+1)==a[j]:
            flag=1
            s=s+str(j+1)+" "
    if flag==1:
        print s
    else:
        print "Not Found"