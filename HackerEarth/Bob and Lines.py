# Bob and Lines

# https://www.hackerearth.com/problem/algorithm/bob-and-lines/

t=int(raw_input())
for i in range(t):
	n,q=map(int,raw_input().split())
	a=[]
	c=int(0)
	for j in range(n):
		a=a+[map(int,raw_input().split())]
	for k in range(q):
		c=0
		x,y=map(int,raw_input().split())
		if x==0:
			for j in range(n):
				if (a[j][1]<=y and a[j][3]>=y) or (a[j][1]>=y and a[j][3]<=y):
					c=c+1
		else:
			for j in range(n):
				if (a[j][0]<=x and a[j][2]>=x) or (a[j][0]>=x and a[j][2]<=x):
					c=c+1
		print c