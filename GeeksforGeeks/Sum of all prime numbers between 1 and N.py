# Sum of all prime numbers between 1 and N.
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=651



def prime(n):
	a=int(n**0.5)
	c=int(0)
	for i in range(1,a+1):
		if n%i==0:
			c=c+1
	if c==1 and n!=1:
		return n
	else:
		return 0

t=int(raw_input())
a=[]
for i in range(t):
	n=int(raw_input())
	s=int(0)
	for j in range(1,n+1):
		s=s+prime(j)
	if i==0:
		a=a+[n=>s]
	print s