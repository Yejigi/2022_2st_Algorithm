a = int(input())
if a % 4 == 0:
    if a % 100 != 0 or a % 400 == 0:
        print(1)
    else:
        print(0)
else:
    print(0)


#종혁 : 고생하셨습니다. 파이썬은 코드 길이가 상대적으로 짧아서 좋은 거 같습니다.