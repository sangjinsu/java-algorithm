package main.boj.bronze4;

import java.util.Scanner;

public class Boj_10039 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            score[i] = sc.nextInt();
            if (score[i] < 40){
                score[i] = 40;
            }
            sum += score[i];
        }

        int result = sum / 5;
        System.out.println(result);
    }
}
