package main.boj.level.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class Boj10950 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        try {
            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                bw.write(a + b + "\n");
                bw.flush();
            }
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
