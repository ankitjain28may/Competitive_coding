# Remove Spaces
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=454

t=int(raw_input())
for i in range(t):
	s=raw_input()
	r=""
	for j in s:
		if j!=' ':
			r=r+j
	print r
