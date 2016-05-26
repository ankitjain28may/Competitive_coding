# Palindrome String
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=222


t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    s=raw_input()
    l=int(n/2)
    flag=int(0)
    for j in range(0,l):
        if s[j]!=s[n-j-1]:
            flag=1
            break
    if flag==1:
        print "No"
    else:
        print "Yes"
