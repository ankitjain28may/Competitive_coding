# https://www.hackerrank.com/contests/w31/challenges/beautiful-word
# Beautiful Word

w = raw_input().strip()
li = ['a', 'e', 'i', 'o', 'u', 'y']
l = len(w)
flag = int(0)
for j in range(0, l-1):
    if w[j] == w[j+1] or (w[j] in li and w[j+1] in li):
        flag = 1
        break
if flag == 1:
    print "No"
else:
    print "Yes"

