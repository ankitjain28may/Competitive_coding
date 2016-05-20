 # Alupuri Treat

 # https://www.hackerearth.com/problem/algorithm/alupuri-treat/


t=int(raw_input())
su=int(0)
r=int(0)
for i in range(t):
	a=[]
	a=map(int,raw_input().split())
	su=su+a[i]
	r=r+a[t-i-1]
if su>=r:
	print su-r
else:
	print r-su