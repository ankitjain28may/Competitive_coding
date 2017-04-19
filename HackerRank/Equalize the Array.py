# Equalize the Array
# https://www.hackerrank.com/challenges/equality-in-a-array

N = int(raw_input())
li = map(int, raw_input().split())
li_c = [li.count(i) for i in li]
print N - max(li_c)
