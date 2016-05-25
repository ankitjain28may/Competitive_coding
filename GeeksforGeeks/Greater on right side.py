# Greater on right side
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=522


t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	a=[]
	a=map(int,raw_input().split())
	for j in range(n-1):
		a[j]=max(a[j+1:])
	a[n-1]=-1
	s=""
	for j in a:
		s=s+str(j)+" "
	print s