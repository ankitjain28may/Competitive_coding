# https://www.hackerrank.com/challenges/between-two-sets
# Between Two Sets

n, m = raw_input().strip().split(' ')
n, m = [int(n), int(m)]
a = map(int, raw_input().strip().split(' '))
b = map(int, raw_input().strip().split(' '))
l = max(b)
count = 0
for i in xrange(1, l + 1):
    fac = [(i % j == 0) for j in a]
    xfac = [(j % i == 0) for j in b]
    if False not in fac and False not in xfac:
        count += 1
print count
