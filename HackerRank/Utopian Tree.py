# Utopian Tree
# https://www.hackerrank.com/challenges/utopian-tree


t = int(raw_input().strip())
for a0 in xrange(t):
    n = int(raw_input().strip())
    x = int(n / 2) + 1
    x = (2**x) - 1
    if n % 2 == 0:
        print x
    else:
        print 2 * x
