# Toss ka Boss

# https://www.hackerearth.com/problem/algorithm/toss-ka-boss/

t=int(raw_input())
for i in range(0,t):
	s=raw_input()
	l=len(s)
	x=int(1)
	sum=int(0)
	for j in range(0,l):
		if (s[j]=='H'):
			sum=sum+x
			x=x+1
		else:
			x=1
	print sum