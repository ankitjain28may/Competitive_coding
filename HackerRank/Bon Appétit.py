# https://www.hackerrank.com/challenges/bon-appetit
# Bon Appétit

n, k = map(int, raw_input().split())
li = map(int, raw_input().split())
charged = int(raw_input())
s = 0
for j in li:
    s += j
s -= li[k]
s = s >> 1
if charged > s:
    print charged - s
else:
    print "Bon Appetit"
