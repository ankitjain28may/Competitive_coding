# https://www.hackerrank.com/challenges/kangaroo
# Kangaroo

x1,v1,x2,v2 = raw_input().strip().split(' ')
x1,v1,x2,v2 = [int(x1),int(v1),int(x2),int(v2)]

v = v1-v2
x = x2-x1
if v <=0:
    print "NO"
else:
    y = int(x/v)
    if y*v == x:
        print "YES"
    else:
        print "NO"
