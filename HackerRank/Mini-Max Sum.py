# https://www.hackerrank.com/challenges/mini-max-sum
# Mini-Max Sum

def sum(start, end, li):
    s = int(0)
    for j in range(start, end):
        s+=li[j]
    return s

li = map(int, raw_input().strip().split(' '))
li.sort()
ma = sum(1, 5, li)
mi = sum(0, 4, li)
print mi, ma