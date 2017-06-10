# Algorithmic Crush
# https://www.hackerrank.com/challenges/crush


N, M = map(int, raw_input().split())
li = [0 for i in xrange(N)]
for i in xrange(M):
    a, b, k = map(int, raw_input().split())
    li[a - 1] = li[a - 1] + k
    if b < N:
        li[b] -= k
s = 0
maxx = 0
for i in li:
    s += i
    if s > maxx:
        maxx = s
print maxx
