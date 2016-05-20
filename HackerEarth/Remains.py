# Remains*

# https://www.hackerearth.com/problem/algorithm/remains/

t=int(raw_input())
for i in range(0,t):
	a,b,c=map(long,raw_input().split())
	sum=a+b
	for j in range(0,c-2):
		if a>b:
			n=a-b
			a=b
			b=n
			sum=sum+n
		else:
			n=b-a
			a=b
			b=n
			sum=sum+n
	print sum