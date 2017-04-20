# Sherlock and Squares
# https://www.hackerrank.com/challenges/sherlock-and-squares

from math import *

N = int(raw_input())
for i in xrange(N):
    i, j = map(int, raw_input().split())
    ce = ceil(sqrt(i))
    fl = floor(sqrt(j))
    count = int(fl - ce) + 1
    print count
