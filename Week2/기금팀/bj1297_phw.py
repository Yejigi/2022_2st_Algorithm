d, h, w = map(int,input().split())  #기곰 : 고생하셨습니다 :>

x = (d**2/((h**2)+(w**2)))**(1/2)

print(int(h*x), int(w*x))
