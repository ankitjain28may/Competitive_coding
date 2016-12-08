# Doraemon's Birthday

# https://www.hackerearth.com/test-487/algorithm/doraemons-birthday/

t=int(raw_input())
for i in range(t):
    a = []
    for j in range(26):
        a.append(0)
    s = raw_input()
    for k in s:
        r = ord(k)%97
        a[r] = a[r]+1
    mid = []
    mid.append(a[3])
    mid.append(a[4])
    mid.append(a[14])
    mid.append(a[17])
    mid.append(a[10])
    mid.append(a[2])
    ch = min(mid)
    if ch == 0 or a[0]==0:
        print 0
    elif a[0] >= 2*ch:
        print ch
    elif int(a[0]/2) <=ch:
        print int(a[0]/2)

