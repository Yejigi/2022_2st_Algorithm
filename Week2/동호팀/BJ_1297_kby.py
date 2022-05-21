a, b, c = map(int,input().split())

diagonal = (a**2/((b**2)+(c**2)))**0.5

print(int(b*diagonal), end=' ')
print(int(c*diagonal))

#학민: 수고하셨습니다 :)