# Middle of Three
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=736


t=int(raw_input())
for i in range(t):
    a=[]
    a=map(int,raw_input().split())
    a.sort()
    print a[1]