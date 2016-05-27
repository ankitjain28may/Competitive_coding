# Remove Duplicates
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=462


t=int(raw_input())
for i in range(t):
    n=raw_input()
    s=""
    for j in n:
        if j not in s:
            s=s+j
    print s
