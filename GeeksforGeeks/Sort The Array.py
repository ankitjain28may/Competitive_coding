# Sort The Array
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=265


t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    a=[]
    a=map(int,raw_input().split())
    a.sort()
    s=""
    for j in a:
        s=s+str(j)+" "
    print s
