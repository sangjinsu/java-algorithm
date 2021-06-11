package main.boj.bronze5;

import java.util.Scanner;

public class Boj_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            byte num = (byte) sc.nextInt();
            sum += num * num;
        }

        byte result = (byte) (sum % 10);

        System.out.println(result);
    }
}
