# Chandu and Primes*

# https://www.hackerearth.com/problem/algorithm/chandu-and-primes-1/

def isPrime2(n):
	if n==2 or n==3:
		return True
	if n%2==0 or n<2:
		return False
	for i in range(3,int(n**0.5)+1,2):
		if n%i==0:
			return False 
	return True
	
def isPrime(j):
	p=str(j)
	y=len(p)
	if y in range(0,y+1):
		if isPrime2(j/(10**y)):
			return True
	return False
 
t=int(raw_input())
x=[2,3,5,7]
c=0
for i in range(0,t):
    c=0
    a,b=map(int,raw_input().split())
    for j in range(a,b+1):
    	if isPrime2(j):
    		c=c+1
    	elif isPrime(j):
    		c=c+1
    print c