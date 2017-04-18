# Angry Professor
# https://www.hackerrank.com/challenges/angry-professor

t = int(raw_input().strip())
for a0 in xrange(t):
    n, k = raw_input().strip().split(' ')
    n, k = [int(n), int(k)]
    a = map(int, raw_input().strip().split(' '))
    li = [i <= 0 for i in a]
    if li.count(True) >= k:
        print "NO"
    else:
        print "YES"
