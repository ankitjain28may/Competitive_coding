# https://www.hackerrank.com/challenges/30-conditional-statements
# Day 3: Intro to Conditional Statements

N = int(raw_input().strip())

if N%2 != 0:
    print "Weird"
else:
    if (N>=2 and N<=5):
        print "Not Weird"
    elif (N>=6 and N<=20):
        print "Weird"
    else:
        print "Not Weird"

