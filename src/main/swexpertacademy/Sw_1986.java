package main.swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_1986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());

            int result = 0;
            for (int j = 1; j <= num; j++) {
                if (j % 2 == 0) {
                    result -= j;
                } else{
                    result += j;
                }
            }

            sb.append("#").append(i+1).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }
}
