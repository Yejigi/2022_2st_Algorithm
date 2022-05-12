
import java.util.Scanner;
public class bj2475_lsj_java {
	public static int[] input_val() {
		Scanner input = new Scanner(System.in);
		String str=input.nextLine();
		String[] str_arr=str.split("\\s");
		int[] result=new int[5];
		for(int cnt=0;cnt<result.length;cnt++) {
			result[cnt]=Integer.parseInt(str_arr[cnt]);
		}
		input.close();
		return result;
	}
	public static int cal(int[] val) {
		int sum=0;
		for(int cnt=0;cnt<val.length;cnt++) {
			sum+=Math.pow(val[cnt], 2);
		}
		return sum%10;
	}
	public static void main(String[] args) {
		int[] val=input_val();
		int result=cal(val);
		System.out.println(result);
	}
}
