package main.boj.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);

        minute -= 45;

        if (minute < 0){
            hour--;
            minute = 60 + minute;
        }

        if (hour < 0 ){
            hour = 24 + hour;
        }

        System.out.println(hour + " " + minute);

        br.close();

    }
}
