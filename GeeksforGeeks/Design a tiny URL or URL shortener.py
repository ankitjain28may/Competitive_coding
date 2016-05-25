# Design a tiny URL or URL shortener
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=495

t=int(raw_input())
for i in range(t):
	n=long(raw_input())
	s=""
	a=int(n)
	while n!=0:
		r=int(n%62)
		if r<26:
			r=r+97
			s=str(unichr(r))+s
		elif r<52:
			r=r+39
			s=str(unichr(r))+s
		else:
			r=r-52
			s=str(r)+s
		
		n=n/62
	print s
	print a