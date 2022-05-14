package Week1.수아팀;

import java.util.Scanner;

public class bj2475_kjy_java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int powSum = 0;
        for (int i = 0; 5 > i; i++) {
            powSum += Math.pow(in.nextInt(), 2);
        }

        System.out.println(powSum % 10);   //수아: 복잡하고 어려울 수 있는 코드를 보기 편하게 해주셨네요!!(❁´◡`❁) 
    }
}
