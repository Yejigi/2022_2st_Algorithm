
import java.util.Scanner;
public class bj2525_lsj_java {
	public static Scanner input=new Scanner(System.in);
	public static int[] calculate_time(int[] time,int target_t) {
		int hour=time[0];
		int min=time[1];
		for(int cnt=0;cnt<target_t;cnt++) {
			if(min==59) {
				min=0;
				if(hour==23) {
					hour=0;
				}
				else {
					hour++;
				}
			}else {
				min++;
			}
		}
		int[] result_time= {hour,min};
		return result_time; 
	}
	public static int target_time_input() {
		int target_time=input.nextInt();
		return target_time;
	}
	public static int[] time_input() {
		int[] time= {input.nextInt(),input.nextInt()};
		return time;
	}
	public static boolean time_validation_check(int[] time,int t_time) {
		int hour=time[0];
		int min=time[1];
		if((hour<0||hour>23)||(min<0||min>59)) {
			return false;
		}
		if(t_time<0||t_time>1000) {
			return false;
		}
		return true;
	}
	public static void time_display(int[] time) {
		for(int cnt=0;cnt<time.length;cnt++) {
			System.out.print(time[cnt]);
			if(cnt==time.length-1) {
				break;
			}
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] time=time_input();
		int t_time=target_time_input(); // t_time은 target_time
		if(time_validation_check(time,t_time)){
			int[] result_time=calculate_time(time, t_time);
			time_display(result_time);
		}
		input.close();
	}

}