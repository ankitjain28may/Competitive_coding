# Vowel or Not
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=280

t=int(raw_input())
for i in range(t):
	c=raw_input()
	if c=='A'or c=='E' or c=='I' or c=='O' or c=='U' or c=='a' or c=='e' or c=='i' or c=='o' or c=='u':
		print "YES"
	else:
		print "NO"
		