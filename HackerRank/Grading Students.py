# https://www.hackerrank.com/challenges/grading
# Grading Students


def solve(grades):
    for i in grades:
        if i >= 38:
            r = int(i/5)
            s = int((r+1)*5)
            if s-i < 3:
                i = s
        print i

n = int(raw_input().strip())
grades = []
grades_i = 0
for grades_i in xrange(n):
    grades_t = int(raw_input().strip())
    grades.append(grades_t)
solve(grades)
