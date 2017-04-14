# https://www.hackerrank.com/challenges/the-birthday-bar
# Birthday Chocolate


def getWays(squares, d, m, n):
    count = int(0)
    for j in range(0, n-m+1):
        sum = int(0)
        for k in range(m):
            sum += squares[j+k]
        if sum == d:
            count+=1
    return count


n = int(raw_input().strip())
s = map(int, raw_input().strip().split(' '))
d,m = raw_input().strip().split(' ')
d,m = [int(d),int(m)]
result = getWays(s, d, m, n)
print(result)
