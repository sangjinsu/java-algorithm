package main.nadongbin.greedy;

import java.util.Scanner;

public class MultiplyORAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        long result = Character.getNumericValue(input.charAt(0));

        int l = input.length();
        for (int i = 1; i < l; i++) {
            int num = Character.getNumericValue(input.charAt(i));
            if (result <= 1 || num <= 1){
                result += num;
            } else {
                result *= num;
            }
        }
        System.out.println(result);
    }
}
