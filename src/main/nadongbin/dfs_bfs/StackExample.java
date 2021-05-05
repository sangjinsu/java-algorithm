package main.nadongbin.dfs_bfs;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(2);

        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }
}
