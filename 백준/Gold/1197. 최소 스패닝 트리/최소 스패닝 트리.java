import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Edge implements Comparable<Edge> {
    int v1, v2, weight;

    public Edge(int v1, int v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    // Priority Queue 활용
    @Override
    public int compareTo(Edge edge) {
        return weight - edge.weight;
    }
}

public class Main {
    static StringTokenizer st;
    static int v; // 정점개수
    static int e; // 간선개수
    static int[] parent;
    static PriorityQueue<Edge> pqueue; // 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        pqueue = new PriorityQueue<>();
        parent = new int[v + 1];

        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }

        // 간선 정보 입력
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());

            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            pqueue.offer(new Edge(v1, v2, weight));
        }

        // 사이클 확인 (union-find)
        int weight = 0;
        while (!pqueue.isEmpty()) {
            Edge c = pqueue.poll();
            if (find(c.v1) != find(c.v2)) {
                union(c.v1, c.v2);
                weight += c.weight;
            }
        }
        System.out.println(weight);
    }

    // 합치기
    public static void union(int node1, int node2) {
        int parent1 = find(node1);
        int parent2 = find(node2);

        if (parent1 < parent2)
            parent[parent2] = parent1;
        else
            parent[parent1] = parent2;
    }

    public static int find(int node) {
        if (parent[node] == node) {
            return node;
        }
        return parent[node] = find(parent[node]);
    }
}
