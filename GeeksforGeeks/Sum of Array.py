# Sum of Array
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=197



t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    a=[]
    a=map(int,raw_input().split())
    s=int(0)
    for j in a:
        s=s+j
    print s
