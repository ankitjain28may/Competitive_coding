# https://www.hackerrank.com/challenges/birthday-cake-candles
# Birthday Cake Candles


n = int(raw_input().strip())
height = map(int,raw_input().strip().split(' '))
ma = max(height)
print height.count(ma)
