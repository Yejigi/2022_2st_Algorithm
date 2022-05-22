h, m = map(int,input().split())
t = int(input())

h += t // 60
m += t % 60

if m >= 60 :
    h += 1
    m -=60

if h >= 24:
    h -= 24

print('%d %d' %(h,m))
##동호:수고하셨습니다!