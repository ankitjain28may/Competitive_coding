# Circles in the text

# https://www.hackerearth.com/problem/algorithm/hole/

t=int(raw_input())
for i in range(t):
    n=raw_input()
    l=len(n)
    c=int(0)
    for j in n:
        if j=='B':
            c=c+2
        elif (j=='A' or j=='D' or j=='O' or j=='P' or j=='R'):
            c=c+1
    print c