# https://www.hackerrank.com/challenges/cats-and-a-mouse
# Cats and a Mouse

q = int(raw_input().strip())
for a0 in xrange(q):
    x, y, z = raw_input().strip().split(' ')
    x, y, z = [int(x), int(y), int(z)]
    a = abs(x - z)
    b = abs(y - z)
    if a < b:
        print "Cat A"
    elif a > b:
        print "Cat B"
    else:
        print "Mouse C"
