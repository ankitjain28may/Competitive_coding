# Snake Procession
# Problem Code: SNAKPROC

# https://www.codechef.com/SNCKQL17/problems/SNAKPROC

T = int(raw_input())
for i in xrange(T):
    L = int(raw_input())
    c = []
    s = raw_input()
    s = s.replace('.', "")
    L = len(s)
    flag = 1
    i = 0
    while(i < L):
        if s[i] != 'H':
            flag = 0
            break
        if i + 1 == L or s[i + 1] != 'T':
            flag = 0
            break
        i += 2
    if flag == 0:
        print "Invalid"
    else:
        print "Valid"
