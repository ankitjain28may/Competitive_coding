# AND operation
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=712

t=int(raw_input())
for i in range(t):
	a,b=map(int,raw_input().split())
	s=int(a)
	for j in range(a+1,b+1):
		s= s&j
	print s
