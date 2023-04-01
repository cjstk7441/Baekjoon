import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ch = in.next().charAt(0); // 문자열을 잘라 문자로 변환
        // int 타입 변수에 저장함으로써 문자에 대응되는 값, 즉 아스키 코드값을 저장
        System.out.println(ch);
    }
}
