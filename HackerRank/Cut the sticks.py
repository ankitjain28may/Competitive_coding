# Cut the sticks
# https://www.hackerrank.com/challenges/cut-the-sticks

#!/bin/python

import sys


n = int(raw_input().strip())
arr = map(int, raw_input().strip().split(' '))
while(True):
    l = len(arr)
    if l == 0:
        break
    print l
    mi = min(arr)
    i = 0
    while(i != l):
        if arr[i] <= mi:
            arr.remove(arr[i])
            l -= 1
            i -= 1
        else:
            arr[i] -= mi
        i += 1
