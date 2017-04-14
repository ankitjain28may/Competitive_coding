# https://www.hackerrank.com/challenges/save-the-prisoner
# Save the Prisoner!

T = int(raw_input())
for T in xrange(T):
    N, M, S = map(int,raw_input().split())
    x = int((S+M-1)%N)
    if x == 0:
        x = N
    print x