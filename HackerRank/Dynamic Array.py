# Dynamic Array
# https://www.hackerrank.com/challenges/dynamic-array

lastAnswer = 0
N, Q = map(int, raw_input().split())
li = []
for i in xrange(N):
    li.append([])
for i in xrange(Q):
    a, x, y = map(int, raw_input().split())
    if a == 1:
        seq = (x ^ lastAnswer) % N
        li[seq].append(y)
    else:
        seq = (x ^ lastAnswer) % N
        l = len(li[seq])
        lastAnswer = li[seq][y % l]
        print lastAnswer
