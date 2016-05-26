# Missing number in array
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=414


t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    a=[]
    a=map(int,raw_input().split())
    for j in range(0,n-1):
        if (j+1)!=a[j]:
            print j+1
            break
