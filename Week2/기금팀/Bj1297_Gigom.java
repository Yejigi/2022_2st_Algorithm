package ComonW6;
import java.util.Scanner;

public class Bj1297_Gigom {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int D = sc.nextInt(); //대각선길이
		int H = sc.nextInt(); //높이
		int W = sc.nextInt(); //너비
		sc.close();
		/*피타고라스의 정리 
		a = 높이 b = 너비 c = 대각선의 길이
		c^2 = a^2 + b^2
		*/
		double R = Math.pow(D,2)/(Math.pow(W,2)+Math.pow(H, 2));
		System.out.print((int)Math.sqrt(R * Math.pow(H,2)) + " " + (int)Math.sqrt(R * Math.pow(W, 2)));
		//Math.sqrt(x) ==> 매개변수는 x를 가지며 주어진 X에 루트를 씌우고 그 값을 반환한다. 만약 x가 음수일시 NaN반환
		//소수점으로 나오는 값들을 integer타입으로 형변환하여 출력한다.
	}

}
