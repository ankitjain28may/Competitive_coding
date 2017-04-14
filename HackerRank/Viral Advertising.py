# https://www.hackerrank.com/challenges/strange-advertising
# Viral Advertising

n = int(raw_input())
m = int(5)
count=int(0)
for i in xrange(n):
    y = m >> 1
    m = y*3
    count+=y
print count
