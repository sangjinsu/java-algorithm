package main.boj.level.bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_1008 {
    public static void main(String[] args) throws IOException {
        /*
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print(a/b);
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Double a = Double.parseDouble(st.nextToken());
        Double b = Double.parseDouble(st.nextToken());

        Double result = a/b;
        bw.write(String.valueOf(result));
        bw.flush();

        br.close();
        bw.close();
    }
}
