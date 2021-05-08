package main.nadongbin.dynamic;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N,M;

        N = sc.nextInt();
        M = sc.nextInt();

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
           coins[i] = sc.nextInt();
        }

        int[] dp = new int[M+1];
        for (int i = 0; i < M+1; i++) {
            dp[i] = 10001;
        }

        dp[0] = 0;
        for (int i = coins[coins.length-1]; i < M+1; i++) {
            for (int j = 0; j < coins.length; j++) {
                dp[i] = Math.min(dp[i], dp[i - coins[j]]+1);
                System.out.println(dp);
            }
        }

        if (dp[M] == 10001){
            System.out.println(-1);
        } else {
            System.out.println(dp[M]);
        }

    }
}
