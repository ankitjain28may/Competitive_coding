# Area of Rectange, Right Angled Triangle and Circle
# http://www.practice.geeksforgeeks.org/problem-page.php?pid=277

t=int(raw_input())
for i in range(t):
    a=[]
    a=map(int,raw_input().split())
    area=int(a[0]*a[1])
    ar=int((a[2]*a[3])/2)
    ci=int(3.14*a[4]*a[4])
    print '%d %d %d'%(area,ar,ci)
