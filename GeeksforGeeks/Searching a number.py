# Searching a number
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=237


t=int(raw_input())
for i in range(t):
    n,e=map(int,raw_input().split())
    a=[]
    a=map(int,raw_input().split())
    flag=int(0)
    for j in range(0,n):
        if a[j]==e:
            flag=1
            break
    if flag==1:
        print j+1
    else:
        print "-1"
            