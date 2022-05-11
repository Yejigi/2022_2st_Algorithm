def pow_cal(val):
    sum=0
    for i in val:
        sum+=int(i)*int(i)
    return sum%10

def main():
    int_arr=input().split(" ")
    summary=pow_cal(int_arr)
    print(summary)
main()
