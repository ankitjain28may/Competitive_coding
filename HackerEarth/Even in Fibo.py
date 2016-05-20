# Even in Fibo

# https://www.hackerearth.com/problem/algorithm/even-fibonacci-numbers/

t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	a=int(1)
	b=int(1)
	c=int(0)
	d=int(0)
	while (a+b)<n:
		d=a
		a=a+b
		b=d
		if a%2==0:
			c=c+a
	print c