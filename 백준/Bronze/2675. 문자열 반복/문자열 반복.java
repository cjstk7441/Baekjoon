import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // 테스트 케이스의 개수
        for (int i = 0; i < T; i++) {
            int R = in.nextInt(); //  테스트케이스의 반복 횟수
            String S = in.next(); // S라는 문자열 주기
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}