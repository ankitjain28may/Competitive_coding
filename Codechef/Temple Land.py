# Temple Land
# Problem Code: TEMPLELA

# https://www.codechef.com/SNCKQL17/problems/TEMPLELA

T = int(raw_input())
for i in xrange(T):
    L = int(raw_input())
    s = map(int, raw_input().split())
    flag = 1
    if L % 2 != 0:
        if s[0] == 1 and s[0] == s[L - 1]:
            for i in xrange(1, (L / 2 + 1)):
                if s[i] != s[L - i - 1] or s[i] != s[i - 1] + 1:
                    flag = 0
                    break
        else:
            flag = 0
    else:
        flag = 0
    if flag == 0:
        print "no"
    else:
        print "yes"
