package main.nadongbin.greedy;

import java.util.Scanner;

public class UntilItReachesOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while (n >= k){
            if (n % k == 0){
                n = n / k;
            } else {
                --n;
            }
            result++;
        }

        result += n-1;
        System.out.println(result);
    }
}
