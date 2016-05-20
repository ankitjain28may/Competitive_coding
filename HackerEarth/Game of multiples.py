#  Game of multiples

# https://www.hackerearth.com/problem/algorithm/multiples/

t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	n=n-1
	th=int(n/3)
	fi=int(n/5)
	s=int(0)
	fif=int(n/15)
	s=(th*(6+(th-1)*3))/2
	s=s+(fi*(10+(fi-1)*5))/2
	s=s-(fif*(30+(fif-1)*15))/2
	print s