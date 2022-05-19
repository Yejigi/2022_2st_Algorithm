
import java.util.Scanner;

public class bj1297_lsj_java {
	public static int[] input() {
		Scanner input=new Scanner(System.in);
		int[] val= {input.nextInt(),input.nextInt(),input.nextInt()};
		input.close();
		return val;
	}
	public static int[] tv_cal(int[] val) {
		int a=val[0];
		int b=val[1];
		int c=val[2];
		double triangle=Math.sqrt(b*b+c*c);
		double width=(a*b)/triangle;
		double height=(a*c)/triangle;
		int[] result= {(int)width,(int)height};
		//System.out.println(result[0]+"    :::     "+result[1]);
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val=input();
		int[] result=tv_cal(val);
		System.out.println(result[0]+" "+result[1]);
	}
}