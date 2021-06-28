package main.boj.bronze4;

import java.util.Scanner;

public class Boj5543 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int burger = 2001;
        int cola = 2001;

        for (int i = 0; i < 3; i++) {
            burger = Math.min(burger, sc.nextInt());
        }

        for (int i = 0; i < 2; i++) {
            cola = Math.min(cola, sc.nextInt());
        }

        int setMenu = burger + cola - 50;
        System.out.println(setMenu);
    }
}
