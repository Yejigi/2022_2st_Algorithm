import java.util.Scanner;

public class bj2525_kjy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        int min = in.nextInt();

        int needTime = in.nextInt();

        min += needTime;

        if (min >= 60) {
            hour += min / 60;
            min %= 60;
        }

        if (hour >= 24) {
            hour %= 24;
        }

        System.out.println(hour + " " + min);
    }
}
