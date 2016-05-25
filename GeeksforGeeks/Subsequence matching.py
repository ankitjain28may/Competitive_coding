# Subsequence matching
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=647

t=int(raw_input())
for i in range(t):
	n=raw_input()
	l=len(n)
	if ('R' in n and 'RY' in n) or ('R' in n and 'RYY' in n) or ('RY' in n and 'RYY' in n) or ('R' in n and 'R' in n):
		print "YES"
	else:
		print "NO"
