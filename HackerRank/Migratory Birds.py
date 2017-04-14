# https://www.hackerrank.com/challenges/migratory-birds
# Migratory Birds


n = int(raw_input().strip())
types = map(int, raw_input().strip().split(' '))
li = [0] * 5
ma, mt = 0, 0
for i in xrange(5):
    li[i] = types.count(i + 1)
for j in xrange(5):
    if li[j] > ma:
        ma = li[j]
        mt = j + 1
print mt
