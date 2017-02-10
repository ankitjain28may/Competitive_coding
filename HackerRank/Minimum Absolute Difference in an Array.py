# Minimum Absolute Difference in an Array
# https://www.hackerrank.com/contests/rookierank-2/challenges/minimum-absolute-difference-in-an-array


#!/bin/python

import sys


n = int(raw_input().strip())
a = map(int, raw_input().strip().split(' '))
# your code goes here

a.sort()
m = abs(a[0] - a[1])
p = abs(a[-1] - a[-2])
k = 0
if m <= p:
    k = m
else:
    k = p
for i in range(1, n-1):
    if abs(a[i] - a[i+1]) < k:
        k = abs(a[i] - a[i+1])
print k
