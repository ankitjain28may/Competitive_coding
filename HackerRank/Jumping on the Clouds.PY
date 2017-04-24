# Jumping on the Clouds
# https://www.hackerrank.com/challenges/jumping-on-the-clouds


n = int(raw_input().strip())
c = map(int, raw_input().strip().split(' '))
count = 0
i = 0
while(i != n - 1):
    if i + 2 < n and c[i + 2] != 1:
        i += 2
    else:
        i += 1
    count += 1
print count
