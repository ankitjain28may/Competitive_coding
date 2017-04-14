# https://www.hackerrank.com/challenges/electronics-shop
# Electronics Shop

s, n, m = raw_input().strip().split(' ')
s, n, m = [int(s), int(n), int(m)]
keyboards = map(int, raw_input().strip().split(' '))
pendrives = map(int, raw_input().strip().split(' '))
keyboards.sort()
pendrives.sort()
a = -1
if pendrives[0] + keyboards[0] <= s:
    for i in keyboards:
        for j in pendrives:
            if i + j <= s and i + j > a:
                a = i + j
print a
