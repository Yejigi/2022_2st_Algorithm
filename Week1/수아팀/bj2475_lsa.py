a = list(map(int, input().split()))
b = []

for i in range(0, len(a)) :
  b.append(a[i]**2)

print(sum(b)%10)

# 주연 :
# 배열과 반복문을 같이 사용하는 방법은 정말 많이 사용하는 방법입니다.
# 제곱 후 덧셈을 해도 좋지만, 나중에 각각의 값을 수정, 관리를 해야 하는 경우 (앞으로의 백준 문제에서 많이 나옵니다) 
# 이 방법이 더 좋을 수 있습니다. 고생하셨습니다.!!!🙂👍  