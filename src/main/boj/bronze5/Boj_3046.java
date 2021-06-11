package main.boj.bronze5;

import java.util.Scanner;

public class Boj_3046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int s = sc.nextInt();

        int r2 = s * 2 - r1;

        System.out.println(r2);
    }
}
