# https://www.hackerrank.com/challenges/drawing-book
# Drawing Book


def solve(n, p):
    z = 0
    x = n - p
    y = p - 1
    if n % 2 != 0:
        x -= 1
    if x > y:
        z = ((y >> 1) + y % 2)
    else:
        z = ((x >> 1) + x % 2)
    return z


n = int(raw_input().strip())
p = int(raw_input().strip())
result = solve(n, p)
print(result)
