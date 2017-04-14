# https://www.hackerrank.com/challenges/find-digits
# Find Digits


t = int(raw_input().strip())
for a0 in xrange(t):
    sn = raw_input().strip().replace('0', "")
    n = int(sn)
    li = [(n % int(i)) for i in sn]
    print li.count(0)
