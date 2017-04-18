# The Hurdle Race
# https://www.hackerrank.com/challenges/the-hurdle-race


n, k = raw_input().strip().split(' ')
n, k = [int(n), int(k)]
height = map(int, raw_input().strip().split(' '))
hurdle = max(height) - k
if hurdle < 0:
    print 0
else:
    print hurdle
