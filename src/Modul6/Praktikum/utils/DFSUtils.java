package Modul6.Praktikum.utils;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSUtils {

    private LinkedList<Integer> adj[];
    private boolean visited[];

    public DFSUtils(int v) {
        adj = new LinkedList[v];
        visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void insertEdge(int src, int dest) {
        adj[src].add(dest);
    }

    public void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n]) {
                DFS(n);
            }
        }
    }

}
