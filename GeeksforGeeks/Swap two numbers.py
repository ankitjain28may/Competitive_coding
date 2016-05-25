# Swap two numbers
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=229

t=int(raw_input())
for i in range(t):
	a,b=map(int,raw_input().split())
	b,a=a,b
	print'%d %d'%(a,b)