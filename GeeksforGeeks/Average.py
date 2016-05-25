# Average
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=582

t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	a=[]
	r=""
	s=int(0)
	a=map(int,raw_input().split())
	for j in range(n):
		s=s+a[j]
		r=r+str(s/(j+1))+" "
	print r

	