# Sum of array elements
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=75

t=int(raw_input())
for i in range(t):
	a=[]
	n=int(raw_input())
	a=map(int,raw_input().split())
	s=int(0)
	for j in a:
		s=s+j
	print s