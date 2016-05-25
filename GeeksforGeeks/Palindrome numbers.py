# Palindrome numbers
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=151

t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	p= bin(n)[2:]
	l=len(p)
	flag=int(0)
	for j in range(0,l/2):
		if p[j]!=p[l-j-1]:
			flag=1
			break
	if flag==1:
		print "0"
	else:
		print "1"
