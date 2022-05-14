package ComonW5;
import java.util.Scanner;

public class Bj5522_Gigom {
	
	public static void main(String[] args) {
		int Ai = 0;
		int sum = 0; 
		Scanner sc = new Scanner(System.in);
		for(int j=0; j<5; j++) {
			Ai = sc.nextInt();
			if( 0<=Ai && Ai<=100 ) {
				sum += Ai;
			} else {
				System.out.println("0이상 100이하의 값을 입력하세요!."); 
				continue;	// <<-- continue문 을 사용하지않고 다른 방법으로는 성재씨께서 하셨던 boolean메서드를 이용하는 법밖에는 없는걸까요? (?ㅅ?)
			} 				// 성재 : 아마도 continue 대신에 return; 을 이용하면 for문 이후의 코드를 실행하지 않고 바로 main() 함수를 종료할 수 있을 거 같습니다!
		}
		sc.close();
		System.out.println(sum);
	}

}
