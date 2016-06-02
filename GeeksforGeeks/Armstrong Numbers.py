# Armstrong Numbers
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=223

t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	a=int(n)
	s=int(0)
	while a!=0:
		s=s+((a%10)**3)
		a=a/10
	if s==n:
		print "Yes"
	else:
		print "No"
		
