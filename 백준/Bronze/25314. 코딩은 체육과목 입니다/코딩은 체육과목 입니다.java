import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 정수 4로 나뉘는 N
        String str = "";

        for(int i =1; i<=n/4; i++){
            str += "long ";
        }
        System.out.println(str + "int");

    }
}