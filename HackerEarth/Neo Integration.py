 # Neo Integration

 # https://www.hackerearth.com/problem/algorithm/integration-1/

t=int(raw_input())
for i in range(1,t+1): 
	n,p,u,r,s=map(int,raw_input().split())
	for j in range(0,n):  
		if p+r<=u: 
			p=p+r
		elif p-s>=0:
			p=p-s
		else:
			p=p
	print 'Case #%d: %d' %(i,p)