# Solve for the Pastry Lover

# https://www.hackerearth.com/problem/algorithm/solve-for-the-pastry-lover/

t=int(raw_input())
for i in range(t):
	l=int(raw_input())
	s=raw_input()
	min=10000
	c=0
	flag=0
	for j in range(0,l-1):
		for k in range(j+1,l):
			if s[j]==s[k]:
				c=k-j
				if(c<min):
					min=c
					flag=1
	if flag==1:
		print min
	else:
		print "-1"