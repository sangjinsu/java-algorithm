package main.nadongbin.implement;


import java.util.Scanner;

public class GameDevelopment {

    public static int N,M,x,y,dir;

    public static int[][] d = new int[50][50];

    public static int[][] arr = new int[50][50];

    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,1,0,-1};

    public static void turnLeft(){
        dir -= 1;
        if (dir == -1) dir = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        x = sc.nextInt();
        y = sc.nextInt();
        dir = sc.nextInt();
        d[x][y] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 1;
        int turnTime = 0;
        while (true){
            turnLeft();
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (d[nx][ny] == 0 && arr[nx][ny] == 0){
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                count++;
                turnTime = 0;
                continue;
            } else {
                turnTime++;
            }

            if (turnTime == 4){
                nx = x - dx[dir];
                ny = y - dy[dir];

                if (arr[nx][ny] == 0){
                    x = nx;
                    y = ny;
                } else {
                    break;
                }

                turnTime = 0;
            }
        }

        System.out.println(count);
    }
}
