package Modul6.Praktikum;

import Modul6.Praktikum.utils.BFSUtils;
import Modul6.Praktikum.utils.DFSUtils;

public class RouteGraph {

    public static void main(String[] args) {
        int nodeSize = 19;
        BFSUtils bfsRoute = new BFSUtils(nodeSize);
        DFSUtils dfsRoute = new DFSUtils(nodeSize);

        bfsRoute.insertEdge(1, 2);
        bfsRoute.insertEdge(2, 1);
        bfsRoute.insertEdge(1, 4);
        bfsRoute.insertEdge(2, 5);
        bfsRoute.insertEdge(5, 2);
        bfsRoute.insertEdge(4, 6);
        bfsRoute.insertEdge(5, 3);
        bfsRoute.insertEdge(6, 7);
        bfsRoute.insertEdge(7, 6);
        bfsRoute.insertEdge(5, 9);
        bfsRoute.insertEdge(9, 5);
        bfsRoute.insertEdge(5, 7);
        bfsRoute.insertEdge(9, 8);
        bfsRoute.insertEdge(8, 9);
        bfsRoute.insertEdge(8, 9);
        bfsRoute.insertEdge(7, 11);
        bfsRoute.insertEdge(11, 7);
        bfsRoute.insertEdge(8, 11);
        bfsRoute.insertEdge(11, 10);

        dfsRoute.insertEdge(1, 2);
        dfsRoute.insertEdge(2, 1);
        dfsRoute.insertEdge(1, 4);
        dfsRoute.insertEdge(2, 5);
        dfsRoute.insertEdge(5, 2);
        dfsRoute.insertEdge(4, 6);
        dfsRoute.insertEdge(5, 3);
        dfsRoute.insertEdge(6, 7);
        dfsRoute.insertEdge(7, 6);
        dfsRoute.insertEdge(5, 9);
        dfsRoute.insertEdge(9, 5);
        dfsRoute.insertEdge(5, 7);
        dfsRoute.insertEdge(9, 8);
        dfsRoute.insertEdge(8, 9);
        dfsRoute.insertEdge(8, 9);
        dfsRoute.insertEdge(7, 11);
        dfsRoute.insertEdge(11, 7);
        dfsRoute.insertEdge(8, 11);
        dfsRoute.insertEdge(11, 10);


        System.out.println("BFSRoute : ");
        bfsRoute.BFS(1);

        System.out.println("\n\nDFSRoute : ");
        dfsRoute.DFS(1);

    }
}
