a, b = input().split()
a = int(a)
b = int(b)
c = int(input())
a = (c+b) // 60 + a
b = (c+b) % 60
print(a % 24, b)