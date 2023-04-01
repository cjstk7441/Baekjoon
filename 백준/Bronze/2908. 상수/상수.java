import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        A = (A%10) * 100 + ((A%100)/10)*10 + (A/100);
        B = (B%10) * 100 + ((B%100)/10)*10 + (B/100);

        System.out.print(A>B? A:B); // A랑 B 둘 중에 누가 더 크니? A가 크다면 A를, B가 크다면 B를 출력하렴
    }
}
