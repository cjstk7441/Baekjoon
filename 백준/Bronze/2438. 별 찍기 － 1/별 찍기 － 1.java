import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) { // 가로 반복 5줄 생성
            for (int j = 1; j <= i; j++) { // 세로 반복 별 몇 개씩 찍을지. 첫 번째 줄엔 1개 2번째 줄엔 2개.. 이런식 
                System.out.print("*");
            }System.out.println();
        }
    }
}