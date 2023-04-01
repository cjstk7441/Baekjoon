import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String a = in.next();

        int sum = 0;

        for (int i = 0; i < N; i++) { // 문자열의 첫 번째 원소(charAt(0)부터 마지막원소 (CharAt(N))까지 각 원소의 누적합
            sum += a.charAt(i) - '0'; // charAt()은 해당 문자의 아스키코드값을 반환하므로 반드시 -48 또는 -'0'을 해주어야 함.
        }
        System.out.println(sum);
    }
}