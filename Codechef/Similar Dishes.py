# Similar Dishes
# Problem code: SIMDISH
# https://www.codechef.com/APRIL17/problems/SIMDISH

n = int(raw_input())
for i in range(n):
    d1 = raw_input().split()
    d2 = raw_input().split()
    c = int(0)
    for j in d1:
        if j in d2:
            c += 1
    if c >= 2:
        print "similar"
    else:
        print "dissimilar"
