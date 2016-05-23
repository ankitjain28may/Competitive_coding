# The Next Palindrome
# Problem code: PALIN
# https://www.codechef.com/problems/PALIN

def rev(no):
	r=int(0)
	while no!=0:
		r=r*10+(no%10)
		no=no/10
	return r

t=int(raw_input())
for i in range(t):
	n=raw_input()
	l=len(n)
	a=int(n)
	if a<9 and a>0:
		print a+1
	elif l%2==0:
		h=l/2
		start=int(a/(10**h))
		end=int(a%(10**h))
		if start>=end:
			x=int(start*(10**h)+rev(start))
		else:
			start=start+1
			x=int(start*(10**h)+rev(start))
		print x
	else:
		h=(l/2)
		start=int(a/(10**h))
		end=int(a-(start*(10**(h))))
		m=int(start%10)
		start=start/10
		re=rev(start)
		if re>end:
			x=int(((start*10)+m)*(10**(h))+re)
		else:
			x=int(((start*10)+(m+1))*(10**(h))+re)
		print x


