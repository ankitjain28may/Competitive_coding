# Print the Kth Digit
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=302

t=int(raw_input())
for i in range(t):
    a,b,k=map(int,raw_input().split())
    s=int(0)
    s=a**b
    s=str(s)
    l=len(s)
    print s[l-k]
