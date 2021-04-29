package main.nadongbin.implement;

import java.util.Scanner;

public class TimeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        sc.close();

        int count = 0;
        for (int hour = 0; hour < h + 1; hour++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if ((hour + String.valueOf(m) + s).contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
