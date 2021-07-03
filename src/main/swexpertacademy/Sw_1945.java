package main.swexpertacademy;

import java.io.*;

public class Sw_1945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCases; i++) {
            int num = Integer.parseInt(br.readLine());

            int[] exponent = new int[5];

            num = divide(num, 2, exponent, 0);
            num = divide(num, 3, exponent, 1);
            num = divide(num, 5, exponent, 2);
            num = divide(num, 7, exponent, 3);
            divide(num, 11, exponent, 4);


            sb.append("#").append(i + 1).append(" ")
                    .append(exponent[0]).append(" ")
                    .append(exponent[1]).append(" ")
                    .append(exponent[2]).append(" ")
                    .append(exponent[3]).append(" ")
                    .append(exponent[4]).append("\n");
        }

        System.out.println(sb);
    }

    public static int divide(int num, int divisor,int[] exponent, int exponentNum){
        while (num % divisor == 0) {
            num /= divisor;
            exponent[exponentNum]++;
        }
        return num;
    }
}
