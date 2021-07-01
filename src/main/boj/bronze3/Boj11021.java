package main.boj.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class Boj11021 {
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

                bw.write("Case #" + (i + 1) + ": " + (a + b) + "\n");
            }
            bw.flush();

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
