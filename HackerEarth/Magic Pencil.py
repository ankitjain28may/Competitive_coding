# Magic Pencil

# https://www.hackerearth.com/problem/algorithm/problem-1-39/


n=int(raw_input())
for i in range(1,n+1):
	lt=map(int,raw_input().split())
	d=int(pow(lt[0],lt[1]))
	e=int((d/lt[2])*lt[2])
	f=int((d/lt[2]+1)*lt[2])
	g=int(d-e)
	h=int(f-d)
	if g<h:
		print e
	else:
		print f