package Week1.수아팀;

import java.util.Scanner;

public class bj1550_kjy_java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String hex = in.next();

        int decimal = Integer.parseInt(hex, 16);
        System.out.println(decimal);
    }
}
