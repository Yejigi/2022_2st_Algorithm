a, b = input().split()
a = int(a)
b = int(b)
c = int(input())
a = (c+b) // 60 + a
b = (c+b) % 60
print(a % 24, b)
#종혁 : 고생하셨습니다. if문 없이 하는 법도 있네요