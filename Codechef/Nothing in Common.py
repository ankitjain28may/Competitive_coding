# Nothing in Common
# Problem code: NOTINCOM
# https://www.codechef.com/problems/NOTINCOM

n = int(raw_input());
for i in range(n):
    a, b = map(int, raw_input().split())
    aList = list(map(int, raw_input().split()))
    aList = aList + list(map(int, raw_input().split()))
    aList = list(set(aList))
    le = len(aList)
    print (a+b) - le

