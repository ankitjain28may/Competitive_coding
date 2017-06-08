# Is It a Snake
# Problem Code: ISSNAKE


# https://www.codechef.com/SNCKPA17/problems/ISSNAKE

T = int(raw_input())
for i in xrange(T):
    n = int(raw_input())
    li = ""
    for j in xrange(2):
        li += raw_input()
    flag = 0
    l = len(li)
    count = 1
    j = 0
    br = 0
    cp = li.count('#')
    for _i in xrange(n):
        if li[_i] == '#':
            j = _i
            break
        elif li[_i + n] == '#':
            j = _i + n
            break

    while j < l:
        if j < n:
            if br != 2 and li[j + n] == '#':
                j = j + n
            elif j < n - 1 and li[j + 1] == '#':
                j += 1
            else:
                break
            count += 1
            br = 1

        else:
            if br != 1 and li[j - n] == '#':
                j -= n
            elif j < l - 1 and li[j + 1] == '#':
                j += 1
            else:
                break
            count += 1
            br = 2

    if count != cp:
        print "no"
    else:
        print "yes"
