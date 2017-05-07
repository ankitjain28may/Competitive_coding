# Is Fibo
# https://www.hackerrank.com/challenges/is-fibo/

from math import *

N = int(raw_input())
for i in xrange(N):
    k = int(raw_input())
    k = 5 * (k * k)
    if ceil(sqrt(k + 4)) == floor(sqrt(k + 4)) or ceil(sqrt(k - 4)) == floor(sqrt(k - 4)):
        print "IsFibo"
    else:
        print "IsNotFibo"
