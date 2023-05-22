import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Node2 {
    int num;
    double x;
    double y;

    public Node2(int num, double x, double y) {
        this.num = num;
        this.x = x;
        this.y = y;
    }
}

class Edge2 implements Comparable<Edge2> {
    int from;
    double weight;

    public Edge2(int from, double weight) {
        this.from = from;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge2 edge) {
        if (this.weight < edge.weight) return -1;
        return 1;
    }
}

public class Main {
    static ArrayList<Node2> list = new ArrayList<>();
    static ArrayList<Edge2>[] edgeList;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        edgeList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            String[] coordinates = reader.readLine().split(" ");
            double x = Double.parseDouble(coordinates[0]);
            double y = Double.parseDouble(coordinates[1]);
            list.add(new Node2(i, x, y));
            edgeList[i] = new ArrayList<>();
        }

        // Calculate all edges
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double dist = Math.sqrt(Math.pow(list.get(i).x - list.get(j).x, 2) + Math.pow(list.get(i).y - list.get(j).y, 2));
                edgeList[i].add(new Edge2(j, dist));
                edgeList[j].add(new Edge2(i, dist));
            }
        }

        visited = new boolean[list.size()];
        double result = prim();
        System.out.printf("%.2f", result);
    }

    public static double prim() {
        PriorityQueue<Edge2> pqueue = new PriorityQueue<>();
        pqueue.offer(new Edge2(0, 0));
        double dist = 0;

        while (!pqueue.isEmpty()) {
            Edge2 c = pqueue.poll();

            if (visited[c.from] == false) {
                dist += c.weight;
                visited[c.from] = true;
            } else continue;

            for (int i = 0; i < edgeList[c.from].size(); i++) {
                Edge2 next = edgeList[c.from].get(i);
                if (visited[next.from] == false) pqueue.offer(new Edge2(next.from, next.weight));
            }
        }
        return dist;
    }
}
