package main.nadongbin.binarySearch;

import java.util.*;

public class RiceCake {

    public static int N,M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        Integer[] dducks = new Integer[N];

        for (int i = 0; i < N; i++) {
            dducks[i] = sc.nextInt();
        }

        Arrays.sort(dducks);

        int start = 0;
        int end = dducks[N-1];

        int result = 0;
        while(start <= end){
            int mid = (start + end) / 2;

            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (dducks[i] - mid > 0){
                    sum += dducks[i] - mid;
                }
            }

           if (sum < M) {
                end = mid -1;
            } else {
                result = mid;
                start = mid +1;
            }
        }

        System.out.println(result);
    }
}
