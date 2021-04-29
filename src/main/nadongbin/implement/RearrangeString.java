package main.nadongbin.implement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RearrangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();

        ArrayList<Character> result = new ArrayList<>();
        int num = 0;

        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (Character.isLetter(str.charAt(i))){
                result.add(str.charAt(i));
            } else {
                num += str.charAt(i) - '0';
            }
        }

        Collections.sort(result);

        int size = result.size();
        for (int i = 0; i < size; i++) {
            System.out.print(result.get(i));
        }

        if (num != 0){
            System.out.print(num);
        }

        System.out.println();
    }
}
