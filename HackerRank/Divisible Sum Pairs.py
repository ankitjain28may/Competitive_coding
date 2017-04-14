# https://www.hackerrank.com/challenges/divisible-sum-pairs
# Divisible Sum Pairs

n, k = raw_input().strip().split(' ')
n, k = [int(n), int(k)]
a = map(int, raw_input().strip().split(' '))
x = 0
for i in xrange(n - 1):
    for j in xrange(i + 1, n):
        if (a[i] + a[j]) % k == 0:
            x += 1
print x
