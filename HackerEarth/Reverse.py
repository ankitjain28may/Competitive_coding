# Reverse*

# https://www.hackerearth.com/problem/algorithm/reverse/

t=int(raw_input())
for i in range(1,t+1):
	print i
	a,b=raw_input().split()
	e=((10**long(a)))
	c=0
	if b=='10':
		c=1
	else:
		b=long(b)
		e=(e/b)+1
		for j in range(0,e):
			n=j*b
			r=0
			s=0
			while n!=0:
				r=n%10
				s=s*10+r
				n=n/10
			if s%b==0:
				c=c+1
	print c%1000000007