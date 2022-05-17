a,b = input().split()
c = input()

a = int(a)
b = int(b)
c = int(c)

b = b + c
while a >= 24 or b >= 60:   
    if b>=60:
        a = a + 1
        b = b - 60
    if a >= 24:
        a = a - 24
        
print("%d %d" %(a,b))
