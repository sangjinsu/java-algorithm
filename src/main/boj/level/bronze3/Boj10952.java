package main.boj.level.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class Boj10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a == 0) {
                break;
            }
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
