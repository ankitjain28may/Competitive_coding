# Sum Of Digits
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=86

t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    s=int(0)
    while n!=0:
        s=s+(n%10)
        n=n/10
    print s
