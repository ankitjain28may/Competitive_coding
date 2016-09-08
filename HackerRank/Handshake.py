#!/bin/python

# Handshake
# https://www.hackerrank.com/challenges/handshake

import sys


T = int(raw_input().strip())
for a0 in xrange(T):
    N = int(raw_input().strip())
    n = int(N*N - N)/2
    print n
