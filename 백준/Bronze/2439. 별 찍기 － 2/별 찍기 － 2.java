import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) { // 가로 반복 5줄 생성
            for (int j = n; j>0; j--) { 
                if(i<j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }System.out.println();
        }
    }
}