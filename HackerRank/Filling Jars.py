# Filling Jars
# https://www.hackerrank.com/challenges/filling-jars


N, M = map(int, raw_input().split())
sum = 0
for i in xrange(M):
    a, b, k = map(int, raw_input().split())
    sum += ((b - a + 1) * k)
print(sum / N)
