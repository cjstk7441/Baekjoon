import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt(); // 몇 단
        for(int j=1;j<10;j++){
            System.out.printf("%d * %d = %d\n",i,j,i*j);
        }
    }
}