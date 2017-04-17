# Picking Numbers
# https://www.hackerrank.com/challenges/picking-numbers

#!/bin/python

import sys


n = int(raw_input().strip())
a = map(int, raw_input().strip().split(' '))
l = len(a)
count = 0
li = [0 for i in range(n)]
for i in xrange(0, l):
    li[i] = a.count(a[i]) + a.count(a[i] + 1)
print max(li)
