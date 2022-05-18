h, m = map(int, input().split())
cm = int(input())

m += cm
h += m // 60
m = m % 60
h = h % 24

print(h, m)