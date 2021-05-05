package main.nadongbin.dynamic;

import java.util.Scanner;

public class AntWorrier {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int[] dp = new int[100];

       int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            dp[i] = sc.nextInt();
        }


        dp[1] = Math.max(dp[0], dp[1]);
        for (int i = 2; i < num; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + dp[i]);
        }

        System.out.println(dp[num]);
    }
}
