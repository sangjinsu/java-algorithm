package main.nadongbin.greedy;

import java.util.*;

public class NumberCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();


        int result = 0;
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> l = new ArrayList();
            for (int j = 0; j < M; j++) {
                l.add(sc.nextInt());
            }
            result = Math.max(result, Collections.min(l));
            l.clear();
        }

        System.out.println(result);
    }
}
