package org.bing.learn.数据结构.图;

public class Test {
    public static void main(String[] args){
        Graph graph=new Graph(5);
        //添加顶点
        graph.addVert("A");
        graph.addVert("B");
        graph.addVert("C");
        graph.addVert("D");
        graph.addVert("E");
        //添加边
        graph.addEdge("A","B");
        graph.addEdge("A","E");
        graph.addEdge("A","D");
        graph.addEdge("B","C");
        graph.addEdge("C","D");
        graph.addEdge("D","E");

        graph.print();
        System.out.println();
        //graph.DFS("C");
        //graph.BFS("A");

        int[] arr=graph.dijkstra(0);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
