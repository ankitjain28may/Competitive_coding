# Count Multiples of Five
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=770

t=int(raw_input())
for i in range(t):
	n,q=map(int,raw_input().split())
	a=[]
	s=""
	x=int(0)
	count=int(0)
	a=map(int,raw_input().split())
	b=[]
	b=map(int,raw_input().split())
	for j in range(q):
		for p in range(b[x]-1,b[x+1]):
			if a[p]%5==0:
				count+=1
		x+=2
		s=s+str(count)+" "
		count=int(0)
	print s

