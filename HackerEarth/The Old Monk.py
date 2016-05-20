# The Old Monk

# https://www.hackerearth.com/problem/algorithm/the-old-monk/

'''
# Read input from stdin and provide input before running code

name = raw_input('What is your name?\n')
print 'Hi, %s.' % name
'''
t=int(raw_input())
for i in range(0,t):
	l=int(raw_input())
	a=map(long,raw_input().split())
	b=map(long,raw_input().split())
	max=0
	c=0
	for j in range(0,l):
		for k in range(0,l):
			if ((b[k]>=a[j]) and (k>=j)):
				c=k-j
				if c>max:
					max=c
	print max
