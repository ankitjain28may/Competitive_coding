# Count numbers
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=597


t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    count=int(0)
    s=""
    for j in range(1,n+1):
        s=str(j)
        if '3' in s:
            count+=1
    print n-count
        

