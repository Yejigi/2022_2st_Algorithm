d, h, w = map(int,input().split())

diagonal = (d**2/((h**2)+(w**2)))**0.5

print(int(h*diagonal), end=' ')
print(int(w*diagonal))

##동호:수고하셨습니다!