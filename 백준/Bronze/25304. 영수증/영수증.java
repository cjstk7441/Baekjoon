import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt(); // 물건 총액
        int N = in.nextInt(); // 물건 종류 수
        int sum = 0;
        for(int i = 1;i<=N;i++){
            int price = in.nextInt(); // 물건 가격
            int num = in.nextInt(); // 물건 개수
            sum += price*num;
        }
        if (X==sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}