# Smaller and Larger
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=572

t=int(raw_input())
for i in range(t):
	n,x=map(int,raw_input().split())
	a=[]
	a=map(int,raw_input().split())
	mi=int(0)
	ma=int(0)
	for j in a:
		if j<=x:
			mi=mi+1
		if j>=x:
			ma=ma+1
	print '%d %d'%(mi,ma)