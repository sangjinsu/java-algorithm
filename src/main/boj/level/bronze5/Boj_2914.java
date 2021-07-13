package main.boj.level.bronze5;

import java.util.Scanner;

public class Boj_2914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte songs = sc.nextByte();
        byte average = sc.nextByte();

        short melodies = (short) (songs * (average - 1) + 1);

        System.out.println(melodies);
    }
}
