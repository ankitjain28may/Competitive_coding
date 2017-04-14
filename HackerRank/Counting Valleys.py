# https://www.hackerrank.com/challenges/counting-valleys
# Counting Valleys

n = int(raw_input())
count = 0
sea = 0
x = raw_input()
for i in x:
    if i == 'U':
        sea += 1
        if sea == 0:
            count += 1
    else:
        sea -= 1
print count
