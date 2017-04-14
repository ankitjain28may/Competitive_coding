# https://www.hackerrank.com/challenges/sock-merchant
# Sock Merchant

n = int(raw_input().strip())
c = map(int, raw_input().strip().split(' '))
cs = list(set(c))
s = 0
li = [(c.count(i) / 2) for i in cs]
for j in li:
    s += j
print s
