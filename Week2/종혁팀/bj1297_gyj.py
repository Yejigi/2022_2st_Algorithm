a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)
d = a / (b**2+c**2)**(1/2)
e = b*d
f = c*d
print(int(e), int(f))