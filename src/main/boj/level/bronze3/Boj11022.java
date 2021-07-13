package main.boj.level.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11022 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        try {
            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                sb.append("Case #")
                        .append(i + 1)
                        .append(": ").append(a).append(" + ").append(b)
                        .append(" = ").append(a + b).append('\n');
            }

            System.out.print(sb);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
