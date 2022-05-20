y = int(input()) #기곰 : 고생하셨습니다 :>
if y%4 == 0 and (y%100!=0 or y%400 == 0):
    print('1')
else:
    print('0')
