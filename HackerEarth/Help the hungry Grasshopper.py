# Help the hungry Grasshopper

# https://www.hackerearth.com/problem/algorithm/help-the-hungry-grasshopper/

t=int(raw_input())
for i in range(t):
	n=int(raw_input())
	p=1
	flag=0
	j=int(0)
	while j<=n:
		j=j+p
		p=p*2
		if j==n:
			flag=1
			break
	if flag==1:
		print "YES"
	else:
		print "NO"