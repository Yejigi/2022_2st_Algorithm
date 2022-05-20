d,w,h=map(int,input().split())      #기곰: 고생하셨습니다 :>
r=d/((h**2+w**2)**0.5)
print(int(h * r), int(w * r))

