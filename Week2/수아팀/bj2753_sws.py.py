y = int(input())
#4의 배수이면서,
if (y%4  ==0):
    # 100의 배수가 아닐 때 또는 400의 배수일 때이다
    if (not(y%100 ==0) or (y%400 == 0)):
        print("1")
else:
    print("0")


