package main.nadongbin.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LawOfLargeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int first = arr[N-1];
        int second = arr[N-2];

        int count = M / (K+1) * K;
        count += M % (K+1);

        int result = 0;
        result += count * first;
        result += (M - count) * second;

        System.out.println(result);
    }
}
