package main.nadongbin.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReplacingElements {
    public static int N, K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for (int i = 0; i < K; i++) {
            if (A[i] < B[i]){
                int temp = A[i];
                A[i] = B[i];
                B[i] = temp;
            } else {
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        System.out.println(sum);
    }
}
