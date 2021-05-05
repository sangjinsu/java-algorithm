package main.nadongbin.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(5);
        queue.offer(6);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
