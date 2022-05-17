D,H,W = input().split()
D,H,W = int(D),int(H),int(W)
r = D/(H**2+W**2)**0.5    
height = int(H*r)
width = int(W*r)
print(height, width)
