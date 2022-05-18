a,b = input().split()
c = input()

a = int(a)
b = int(b)
c = int(c)

sum = b+c

while a >= 24 or sum >= 60:   
    if sum>=60:
        a += 1
        sum -= 60
    if a >= 24:
        a -= 24
        
print(a,sum)