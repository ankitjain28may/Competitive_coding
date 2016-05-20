# Breaking Bad

# https://www.hackerearth.com/problem/algorithm/breaking-bad-3/

t=int(raw_input())
for i in range(0,t):
	l=int(raw_input())
	a=[]
	a=map(int,raw_input().split())
	a.sort()
	s=int(0)
	j=0
	while j<l:
		s=s+(a[j]*a[j+1])
		j=j+2
	print s