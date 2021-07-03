package main.swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class Sw_1928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String encode = br.readLine();
            String decode = new String(Base64.getDecoder().decode(encode));
            sb.append("#").append((i+1)).append(" ").append(decode).append("\n");
        }

        System.out.println(sb);
    }
}
