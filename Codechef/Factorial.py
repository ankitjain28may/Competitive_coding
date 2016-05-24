# Factorial
# Problem code: FCTRL
# https://www.codechef.com/problems/FCTRL



t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	c=int(0)
	m=int(5)
	while n/m!=0:
		c=c+(n/m)
		m=m*5
	print c
