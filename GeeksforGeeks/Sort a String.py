# Sort a String
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=295


t=int(raw_input())
for i in range(t):
    n=int(raw_input())
    s=raw_input()
    a=[]
    for j in s:
        a=a+[ord(j)]
    a.sort()
    s=""
    for j in a:
        s=s+str(unichr(j))
    print s
