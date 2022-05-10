package day1;
import java.util.Scanner;
public class bj10869_lsj_java {
	public static Scanner input = new Scanner(System.in);
	public static int[] input_value() {
		String str=input.nextLine();
		String[] str_arr=str.split("\\s");
		int[] value_table= {Integer.parseInt(str_arr[0]),Integer.parseInt(str_arr[1])};
		return value_table;
	}
	public static boolean validation_check(int[] val) {
		for(int count=0;count<val.length;count++) {
			if(val[count]<1||val[count]>10000) {
				return false;
			}
		}
		return true;
	}
	public static int[] calculation(int[] val) {
		int[] result=new int[5];
		int a=val[0];int b=val[1];
		result[0]=a+b;
		result[1]=a-b;
		result[2]=a*b;
		result[3]=a/b;
		result[4]=a%b;
		return result;
	}
	public static void print_arr(int[] arr) {
		for(int count=0;count<arr.length;count++) {
			System.out.println(arr[count]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input_val=input_value();
		if(validation_check(input_val)) {
			int[] result=calculation(input_val);
			print_arr(result);
		}
	}
}