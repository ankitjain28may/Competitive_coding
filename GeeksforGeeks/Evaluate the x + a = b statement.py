# Evaluate the x + a = b statement
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=622

t=int(raw_input())
for i in range(t):
	n=raw_input()
	a=int(0)
	b=int(0)
	flag=0
	s=""
	for j in n:
		if j=='+':
			flag='+'
			continue
		elif j=='=':
			flag='='
			s=""
			continue
		if flag=='+' and j!=' ':
			s=s+j
			a=int(s)
		elif flag=='=' and j!=' ':
			s=s+j
			b=int(s)
	print b-a
