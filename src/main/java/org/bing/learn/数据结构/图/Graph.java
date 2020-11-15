package org.bing.learn.数据结构.图;

import java.util.*;

public class Graph {
    List<String> list;  //顶点
    int[][] edge;       //边
    int[] visit;        //访问（0未访问，1访问）
    int size;           //顶点数目

    public Graph(int size){
        this.list=new ArrayList<>(size);
        this.edge=new int[size][size];
        this.visit=new int[size];
        this.size=size;
    }

    //获取顶点对应的坐标
    public int getPosition(String vert){
        for(int i=0;i<size;i++){
            if(list.get(i).equals(vert)){
                return i;
            }
        }
        return -1;
    }

    //添加顶点
    public void addVert(String vert){
        list.add(vert);
    }

    //添加边
    public void addEdge(String vert1, String vert2){
        int index1=getPosition(vert1);
        if(index1==-1){
            return;
        }
        int index2=getPosition(vert2);
        if(index2==-1){
            return;
        }
        //无向图
        edge[index1][index2]=1;
        edge[index2][index1]=1;
    }

    //深度搜索
    public void DFS(String start){
        int index=getPosition(start);
        Stack<Integer> stack=new Stack<>();
        stack.push(index);
        visit[index]=1;
        while (!stack.isEmpty()){
            int v=-1;
            //找栈顶的邻接节点
            for(int j=0;j<size;j++){
                if(edge[stack.peek()][j]==1 && visit[j]==0){
                    v=j;
                    break;
                }
            }
            //没有邻接节点，弹出
            if(v==-1){
                stack.pop();
            }else{
                visit[v]=1;     //设置已访问
                stack.push(v);  //邻接节点入栈
                System.out.println(v);
            }
        }
    }

    //广度搜索
    public void BFS(String start){
        int index=getPosition(start);
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(index);
        visit[index]=1;
        if(index==-1){
            return;
        }
        while (!queue.isEmpty()){
            int top= queue.remove();
            System.out.println(top);
            for(int j=0;j<size;j++){
                if(edge[top][j]==1 && visit[j]==0){
                    queue.add(j);
                    visit[j]=1;
                }
            }
        }
    }

    public void print() {
        System.out.print("G ");
        for (String vertex: list) {
            System.out.print(vertex+" ");
        }
        System.out.println();
        for (int i = 0; i <size; i++) {
            String vertex = list.get(i);
            System.out.print(vertex+" ");
            for (int j = 0; j < size; j++) {
                System.out.print(edge[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public int[] dijkstra(int v) {
        if (v < 0 || v >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        boolean[] st = new boolean[size];// 默认初始为false
        int[] distance = new int[size];// 存放源点到其他点的矩离

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (edge[i][j] == 0) {
                    edge[i][j] = Integer.MAX_VALUE;
                    edge[j][i] = Integer.MAX_VALUE;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            distance[i] = edge[v][i];
        }
        st[v] = true;
        // 处理从源点到其余顶点的最短路径
        for (int i = 0; i < size; ++i) {
            int min = Integer.MAX_VALUE;
            int index=-1;
            // 比较从源点到其余顶点的路径长度
            for (int j = 0; j < size; ++j) {
                // 从源点到j顶点的最短路径还没有找到
                if (st[j]==false) {
                    // 从源点到j顶点的路径长度最小
                    if (distance[j] < min) {
                        index = j;
                        min = distance[j];
                    }
                }
            }
            //找到源点到索引为index顶点的最短路径长度
            if(index!=-1) {
                st[index] = true;
            }
            // 更新当前最短路径及距离
            for (int w = 0; w < size; w++) {
                if (st[w] == false) {
                    if (edge[index][w] != Integer.MAX_VALUE && (min + edge[index][w] < distance[w])) {
                        distance[w] = min + edge[index][w];
                    }
                }
            }
        }
        return distance;
    }


}
