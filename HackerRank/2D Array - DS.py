# 2D Array - DS
# https://www.hackerrank.com/challenges/2d-array


arr = []
for arr_i in xrange(6):
    arr_temp = map(int, raw_input().strip().split(' '))
    arr.append(arr_temp)
pre = -1000
for i in range(4):
    for j in range(4):
        s = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j +
                                                                   1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
        if s > pre:
            pre = s
print pre
