# Word Frequency counter

# https://www.hackerearth.com/problem/algorithm/word-frequency-counter/

a=[]
a=raw_input().split()
l=len(a)
c=int(1)
for i in range(0,l):
	for j in range(i,l):
		if a[i].upper()==a[j].upper() and a[i]!=' ' and i!=j:
			c=c+1
			a[j]=' '
	if a[i]!=' ':
		print a[i].upper(),c
	c=1