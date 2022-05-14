#종혁 : 고생하셨습니다.
a = list(map(int, input().split()))
result = 0
for i in a:
    result += i*i
result %= 10
print(result)