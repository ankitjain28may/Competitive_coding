# Your Name is Mine
# Problem code: NAME2
# https://www.codechef.com/problems/NAME2

t=int(raw_input())
for i in range(t):
	m,n=raw_input().split()
	l1=len(m)
	l2=len(n)
	flag=int(0)
	if l1>l2:
		for j in range(l1-l2+1):
			if m[j:j+l2]==n:
				flag=1
				break
	else:
		for j in range(l2-l1+1):
			if n[j:j+l1]==m:
				flag=1
				break
	if flag==1:
		print("YES")
	else:
		print("NO")

		# efn