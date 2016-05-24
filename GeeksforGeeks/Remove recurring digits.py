# Remove recurring digits
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=617


t=int(raw_input())
for i in range(t):
    n=raw_input()
    a=[]
    a=a+[n[0]]
    m=int(0)
    for j in range(1,len(n)):
        if n[j]!=a[m]:
            a=a+[n[j]]
            m=m+1
    print ''.join(a)