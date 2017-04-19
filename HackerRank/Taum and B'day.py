# Taum and B'day
# https://www.hackerrank.com/challenges/taum-and-bday

t = int(raw_input().strip())
for a0 in xrange(t):
    b, w = raw_input().strip().split(' ')
    b, w = [long(b), long(w)]
    x, y, z = raw_input().strip().split(' ')
    x, y, z = [long(x), long(y), long(z)]
    price = 0
    if z + y < x:
        price += (b * (z + y))
    else:
        price += (b * x)
    if z + x < y:
        price += (w * (z + x))
    else:
        price += (w * y)
    print price
