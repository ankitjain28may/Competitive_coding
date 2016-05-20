# Maximum Power*

# https://www.hackerearth.com/problem/algorithm/maximum-power/

n,d=map(int,raw_input().split())
a=[]
q=[]
a=map(int,raw_input().split())
for j in range(d):
	k,b,c=raw_input().split()
	b=int(b)
	c=int(c)
	if k=='P':
		a[b-1]=c
	else:
		ma=int(-100000)
		q=a[b-1:c]
		q.sort()
		l=len(q)
		print max(q[0]*q[1],q[l-2]*q[l-1])