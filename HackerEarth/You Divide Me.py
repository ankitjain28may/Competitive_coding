for i in range(1001):
    a=str(i)
    if '0' not in a:
        l=set(list(a))
        if len(a)==len(l):
            flag=int(0)
            for j in l:
                if i%int(j)!=0:
                    flag=1
                    break
            if flag!=1:print(i,"",end="")