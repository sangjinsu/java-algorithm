package main.boj.level.bronze4;

import java.util.Scanner;

public class Boj_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((c - b) <= 0) {
            System.out.println(-1);
        } else {
            int result = a / (c - b) + 1;
            System.out.println(result);
        }

    }
}
