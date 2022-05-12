package Week1.수아팀;

import java.util.Scanner;

public class bj5522_kjy_java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; 5 > i; i++) {
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}
