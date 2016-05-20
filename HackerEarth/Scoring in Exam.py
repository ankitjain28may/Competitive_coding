# Scoring in Exam*

# https://www.hackerearth.com/problem/algorithm/scoring-in-exam-1/

n,q=map(int,raw_input().split())
t=map(long,raw_input().split())
s=map(long,raw_input().split())
for i in range(1,q+1):
	a=int(raw_input())
	t.sort()
	sum=long(0)
	for j in range(-a,0):
		sum=sum+t[j]
	print sum