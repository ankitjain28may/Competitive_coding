# Ravi's Trouble

# https://www.hackerearth.com/problem/algorithm/ravis-trouble-3/

t=int(raw_input())
for i in range(t):
	s=raw_input()
	ss=raw_input()
	l=len(s)
	ll=len(ss)
	k=int(0)
	flag=int(0)
	for j in ss:
		flag=0
		for k in range(k,l):
			if j==s[k]:
				flag=1
				break
		if flag==0:
			break
	if flag==0:
		print "NO"
	else:
		print "YES"