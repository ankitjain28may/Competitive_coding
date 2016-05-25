# Number of occurrence
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=577


t=int(raw_input())
for i in range(t):
    n,e=map(int,raw_input().split())
    a=[]
    a=map(int,raw_input().split())
    c=int(0)
    for j in a:
        if j==e:
            c+=1
    if c==0:
        print "-1"
    else:
        print c
