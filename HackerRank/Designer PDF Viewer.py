# https://www.hackerrank.com/challenges/designer-pdf-viewer
# Designer PDF Viewer

h = map(int, raw_input().strip().split(' '))
word = raw_input().strip()
w = len(word)
hei = [h[ord(i)-97] for i in word]
print max(hei)*w
