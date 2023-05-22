import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class City implements Comparable<City> {
    int num;
    int cost;

    public City(int num, int cost) {
        this.num = num;
        this.cost = cost;
    }

    @Override
    public int compareTo(City next) {
        return this.cost - next.cost;
    }
}

public class Main {
    static int N1, N2, M1, M2;
    static ArrayList<City>[] array;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N1 = Integer.parseInt(br.readLine());
        dist = new int[N1 + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        array = new ArrayList[N1 + 1];
        for (int i = 1; i < N1 + 1; i++) {
            array[i] = new ArrayList<City>();
        }
        N2 = Integer.parseInt(br.readLine());

        String[] inputs;
        for (int i = 0; i < N2; i++) {
            inputs = br.readLine().split(" ");
            int to = Integer.parseInt(inputs[0]);
            int from = Integer.parseInt(inputs[1]);
            int weight = Integer.parseInt(inputs[2]);
            array[to].add(new City(from, weight));
        }

        inputs = br.readLine().split(" ");
        M1 = Integer.parseInt(inputs[0]);
        M2 = Integer.parseInt(inputs[1]);
        dijkstra();
        System.out.print(dist[M2]);
    }

    public static void dijkstra() {
        PriorityQueue<City> pqueue = new PriorityQueue<City>();
        dist[M1] = 0;
        pqueue.offer(new City(M1, 0));

        while (!pqueue.isEmpty()) {
            City city = pqueue.poll();

            if (city.cost > dist[city.num]) {
                continue;  // Skip outdated entries in the priority queue
            }

            for (City next : array[city.num]) {
                int nextDist = next.cost + city.cost;
                if (nextDist < dist[next.num]) {
                    dist[next.num] = nextDist;
                    pqueue.offer(new City(next.num, nextDist));
                }
            }
        }
    }
}
