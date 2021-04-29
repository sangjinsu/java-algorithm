package main.nadongbin.implement;

import java.util.Scanner;

public class RoyalKnight {
    public static void main(String[] args) {

        int[] dx = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
        int[] dy = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};

        Scanner sc = new Scanner(System.in);

        String loc = sc.nextLine();
        sc.close();

        int x = loc.charAt(0) - 'a' + 1;
        int y = loc.charAt(1) - '0';

        int result = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 1 || ny < 1 || nx > 8 || ny > 8){
                continue;
            }

            result++;
        }

        System.out.println(result);
    }
}
