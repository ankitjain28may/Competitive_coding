# Jump Out
# https://www.hackerearth.com/challenge/competitive/june-circuits-17/algorithm/jump-out-34/

n = int(raw_input())
li = map(int, raw_input().split())
s = 0
m = 0
for i in xrange(n, 0, -1):
    if li[i - 1] > s:
        m = i - 1
    s += 1
print m + 1
