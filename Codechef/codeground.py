import math
n,ra=map(int,raw_input().split())
x=[]
y=[]
c=int(0)
for i in range(n):
	a,b=map(int,raw_input().split())
	x=x+[a]
	y=y+[b]
for i in range(n-1):
	for j in range(i+1,n):
		if True:
			r=((x[i]-x[j])**2)+((y[i]-y[j])**2)
			if r>((2*ra)**2):
				c=c+1
print c


