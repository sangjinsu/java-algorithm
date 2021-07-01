package main.boj.bronze3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Boj10951 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();

            bw.write(a + b + "\n");
            bw.flush();
        }

        bw.close();
    }
}
