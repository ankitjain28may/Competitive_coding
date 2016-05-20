# Dalton and Compiler Design

# https://www.hackerearth.com/problem/algorithm/dalton-and-compiler-design/

t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	b=int(0)
	a=int(0)
	if n%2==0:
		n=n/2
		print n,n
	else:
		b=(n-1)/2
		a=n-b
		print b,a