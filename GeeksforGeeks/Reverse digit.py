# Reverse digit
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=554

t=int(raw_input())
for i in range(t):
	a=long(raw_input())
	s=long(0)
	while a!=0:
		s=s*10+(a%10)
		a=a/10
	print s

