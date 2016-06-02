# k largest elements
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=601


t=int(raw_input())
for i in range(t):
	l,k=map(int,raw_input().split())
	a=[]
	a=map(int,raw_input().split())
	a.sort()
	s=""
	for j in range(l-k,l):
		s=str(a[j])+" "+s
	print s