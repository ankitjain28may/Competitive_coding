# https://www.hackerrank.com/challenges/breaking-best-and-worst-records
# Breaking the Records

def getRecord(s):
    mi = s[0]
    mis, mas = 0, 0
    ma = s[0]
    for i in s:
        if i < mi:
            mi = i
            mis += 1
        if i > ma:
            ma = i
            mas += 1
    return mas, mis


n = int(raw_input().strip())
s = map(int, raw_input().strip().split(' '))
result = getRecord(s)
print " ".join(map(str, result))
