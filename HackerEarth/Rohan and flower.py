 # // Rohan and flower*

 # // https://www.hackerearth.com/problem/algorithm/rohan-and-flower/



f=int(raw_input())
h=int(raw_input())
a=[]
a=map(int,raw_input().split())
a.sort()
l=len(a)
c=0
for i in range(0,l-2):
	for j in range(i+1,l-1):
		for k in range(j+1,l):
				p=int(a[i]*a[j]*a[k])
				if p%h==0:
					c=c+1
print c