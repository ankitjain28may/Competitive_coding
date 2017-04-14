# https://www.hackerrank.com/challenges/apple-and-orange
# Apple and Orange

s,t = raw_input().strip().split(' ')
s,t = [int(s),int(t)]
a,b = raw_input().strip().split(' ')
a,b = [int(a),int(b)]
m,n = raw_input().strip().split(' ')
m,n = [int(m),int(n)]
apple = map(int,raw_input().strip().split(' '))
orange = map(int,raw_input().strip().split(' '))

apple_list = [(a+i >=s and a+i <=t) for i in apple]
orange_list = [(b+i >=s and b+i <=t) for i in orange]
print apple_list.count(True)
print orange_list.count(True)
