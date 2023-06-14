package Modul6.Praktikum.utils;

import java.util.LinkedList;
import java.util.Queue;

public class BFSUtils {
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue;

    public BFSUtils(int data) {
        node = data;
        adj = new LinkedList[data];

        for (int i = 0; i < data; i++) {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }

    public void insertEdge(int i, int j) {
        adj[i].add(j);
    }

    public void BFS(int i) {
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[i] = true;
        queue.add(i);

        while (queue.size() != 0) {
            i = queue.poll();
            System.out.print(i + " ");

            for (int j = 0; j < adj[i].size(); j++) {
                a = adj[i].get(j);

                if (!nodes[a]) {
                    nodes[a] = true;
                    queue.add(a);
                }
            }
        }
    }
}
