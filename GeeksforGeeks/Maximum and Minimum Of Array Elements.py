# Maximum and Minimum Of Array Elements
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=85

t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    a=[]
    a=map(int,raw_input().split())
    print '%d %d'%(max(a),min(a))
