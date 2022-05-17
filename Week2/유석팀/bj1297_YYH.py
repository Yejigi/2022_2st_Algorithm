import math

d, h, w = map(int, input().split())
print(int(d*h//math.sqrt((h*h)+(w*w))))
print(int(d*w//math.sqrt((h*h)+(w*w))))