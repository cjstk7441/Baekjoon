import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(); // 테스트 케이스의 개수
        for(int i=1;i<=num;i++){
            String[] S = in.next().split("");
            System.out.print(S[0]);
            System.out.println(S[S.length-1]);
        }
    }
}