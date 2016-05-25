# Second Largest
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=538


t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	a=[]
	a=map(int,raw_input().split())
	a.sort()
	print a[n-2]
	