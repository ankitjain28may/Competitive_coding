# Encryption
# https://www.hackerrank.com/challenges/encryption

import math

s = raw_input().strip()
l = len(s)
sqrt = math.sqrt(l)
rows = int(math.floor(sqrt))
columns = int(math.ceil(sqrt))
li = [s[i * columns:i * columns + columns] for i in xrange(rows)]
li.append(s[(rows) * columns:])
new = ""
for i in range(columns):
    for j in li:
        try:
            new = new + j[i]
        except:
            pass
    new += " "
print new
