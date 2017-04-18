# Beautiful Days at the Movies
# https://www.hackerrank.com/challenges/beautiful-days-at-the-movies

i, j, k = map(int, raw_input().strip().split(' '))
count = 0
for x in range(i, j + 1):
    n = x
    s = 0
    while(n != 0):
        s = (s * 10) + n % 10
        n = n / 10
    if abs(s - x) % k == 0:
        count += 1
print count
