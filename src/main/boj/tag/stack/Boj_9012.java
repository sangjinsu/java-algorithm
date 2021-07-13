package main.boj.tag.stack;

import java.io.*;

public class Boj_9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCases; i++) {
            String input = br.readLine();

            String result = "YES";
            int stack = 0;
            for (int j = 0; j < input.length(); j++) {
                char letter = input.charAt(j);
                if (letter == '('){
                    stack++;
                } else {
                    if (stack == 0){
                        result = "NO";
                        break;
                    }
                    stack--;
                }
            }

            if (stack > 0){
                result = "NO";
            }

            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
