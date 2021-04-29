package main.nadongbin.implement;

import java.util.ArrayList;
import java.util.Scanner;

public class TopBottomLeftRight {
    public static void main(String[] args) {
        String[] directions = new String[]{"L", "R", "U", "D"};
        int[] dx = new int[]{0, 0, -1, 1};
        int[] dy = new int[]{-1, 1, 0, 0};

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String[] moves = sc.nextLine().split(" ");
        sc.close();
        int x = 1;
        int y = 1;

        for (String move : moves
        ) {
            int nx = -1;
            int ny = -1;

            for (int i = 0; i < directions.length; i++) {
                if (move.equals(directions[i])) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                }
            }

            if (nx < 1 || ny < 1 || nx > N || ny > N) {
                continue;
            }

            x = nx;
            y = ny;
        }

        System.out.printf("%s %s%s", x, y, System.lineSeparator());
    }
}
