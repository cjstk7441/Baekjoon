import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Stream;

class Node implements Comparable<Node> {
    int index;
    int cost;

    public Node(int index, int cost) {
        this.index = index;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.cost, o.cost);
    }
}

public class Main {
    static ArrayList<Node>[] list;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int dot = input[0], line = input[1];
        int start = Integer.parseInt(br.readLine());

        list = new ArrayList[dot + 1];
        for (int i = 1; i < list.length; i++) list[i] = new ArrayList<Node>();
        for (int i = 0; i < line; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int d = Integer.parseInt(s[2]);
            list[a].add(new Node(b, d));
        }

        dist = new int[dot + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        dijkstra(start);

        for (int i = 1; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) System.out.println("INF");
            else System.out.println(dist[i]);
        }
    }

    private static void dijkstra(int ss) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(ss, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            for (Node next : list[now.index]) {  // Fixed typo here
                if (dist[next.index] > now.cost + next.cost) {
                    dist[next.index] = now.cost + next.cost;
                    pq.add(new Node(next.index, dist[next.index]));
                }
            }
        }
    }
}
