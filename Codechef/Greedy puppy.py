# Greedy puppy
# Problem code: GDOG
# https://www.codechef.com/problems/GDOG

t=int(raw_input())
for i in range(t):
    a,b=map(int,raw_input().split())
    max=int(0)
    if b>a:
    	max=a
    else:
    	for i in range(2,b+1):
    		if a%i>max:
    			max=a%i
    print max