# Word Sort
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=657

t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	a=[]
	a=raw_input().split()
	s=[]
	p=""
	x=int(0)
	for j in a:
		s=s+[len(j)]
		x=x+len(j)
	s.sort()
	s=s+[x]
	for j in s:
		p=p+str(j)+" "
	print p
