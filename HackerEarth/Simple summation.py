# Simple summation

# https://www.hackerearth.com/problem/algorithm/simple-summation/

t=int(raw_input())
for i in range(t):
	n,k=raw_input().split()
	n=int(n)
	k=int(k)
	su=int(0)
	r=int(n%k)
	p=int(n/k)
	su=(k*(k-1))/2
	su=su*p
	su=su+(r*(r+1)/2)
	print su