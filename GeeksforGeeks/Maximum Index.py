# Maximum Index
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=129

t=int(raw_input())
for k in range(t):
	l=int(raw_input())
	a=[]
	ma=int(0)
	a=map(int,raw_input().split())
	for i in range(l-1):
		for j in range(i+1,l):
			if (j-i)>ma and a[i]<=a[j]:
				ma=j-i
	print ma