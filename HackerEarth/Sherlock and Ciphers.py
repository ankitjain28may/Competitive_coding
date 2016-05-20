# Sherlock and Ciphers

# https://www.hackerearth.com/problem/algorithm/sherlock-and-ciphers-5/

import math
t=int(raw_input())
for i in range(t):
	s=raw_input()
	l=len(s)
	p=int(math.sqrt(l))
	ss=""
	for i in range(0,p):
		j=i
		while j<l:
			ss=ss+s[j]
			j=j+p
	print ss