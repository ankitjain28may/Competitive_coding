# Sums and Factorials

# https://www.hackerearth.com/problem/algorithm/the-game-of-factorials/

import math
t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	k=math.factorial(n)
	s=int(0)
	while k!=0:
		r=k%10
		s=s+r
		k=k/10
	print s