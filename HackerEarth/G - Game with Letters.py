 # G - Game with Letters*

 # https://www.hackerearth.com/problem/algorithm/g-game-with-letters/

 t=int(raw_input())
for i in range(t):
	n,st=raw_input().split()
	n=int(n)
	g=[]
	x=int(0)
	su=int(0)
	x=int(0)
	l=int(0)
	ma=int(0)
	for j in range(n):
		g+=[raw_input()]
	c=int(0)
	for j in range(0,n):
		su=0
		c=0
		for k in g[j]:
			c=0
			for p in st:
				if k==p:
					c=c+1
			su=su+c
		if su>ma:
			ma=su
			x=j
			l=len(g[j])
		elif su==ma and l>len(g[j]):
			ma=su
			x=j
			l=len(g[j])
	print x+1