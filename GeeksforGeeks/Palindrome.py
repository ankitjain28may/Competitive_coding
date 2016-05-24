# Palindrome
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=652


t=int(raw_input())
for i in range(t):
	a=int(raw_input())
	n=int(a)
	s=int(0)
	while n!=0:
		s=(s*10)+(n%10)
		n=n/10
	if s==a:
		print "Yes"
	else:
		print "No"
