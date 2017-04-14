# https://www.hackerrank.com/challenges/repeated-string
# Repeated String


s = raw_input().strip()
n = long(raw_input().strip())
l = len(s)
la = s.count('a')
x = long(n / l) * la
xa = long(n % l)
x += s[:xa].count('a')
print x
