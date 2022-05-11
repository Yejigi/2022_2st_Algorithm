
import java.util.Scanner;
public class bj5522_lsj_java {
	public static int[] score_input() {
		Scanner input = new Scanner(System.in);
		int[] scores= {
				input.nextInt(),
				input.nextInt(),
				input.nextInt(),
				input.nextInt(),
				input.nextInt(),
		};
		input.close();
		return scores;
	}
	public static int summary(int[] arr) {
		int sum=0;
		for(int cnt=0;cnt<arr.length;cnt++) {
			sum+=arr[cnt];
		} return sum;
	}
	public static boolean validation_check(int[] arr) {
		for(int cnt=0;cnt<arr.length;cnt++) {
			if(arr[cnt]<0||arr[cnt]>100){
				return false;
			}
		}return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores=score_input();
		if(validation_check(scores)) {
			System.out.println(summary(scores));
		}
	}

}
