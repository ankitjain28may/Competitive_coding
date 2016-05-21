# Subtraction Problem

#  https://www.hackerearth.com/problem/algorithm/subtraction-problem/


a,b = raw_input().split() 
a,b=int(a),int(b)
if a>b:
	c=a-b+1
else:
	c=b-a+1
print c