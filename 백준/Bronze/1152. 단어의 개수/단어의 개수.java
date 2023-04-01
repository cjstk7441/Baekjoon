import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0; // 단어 개수
        String S = in.nextLine(); // 입력받을 문자열

        for(int i = 0;i<S.length();i++){ // 공백 개수 세기
            if(S.charAt(i)==' '){
                num++;
            }
        }
        if(S.charAt(0) != ' ' && S.charAt(S.length()-1)!=' '){ // 첫 번째, 마지막 둘 다 공백 X
            num += 1;
        }else if(S.charAt(0) ==' ' && S.charAt(S.length()-1)==' '){ // 첫 번째, 마지막 공백 O
            num -= 1;
        }
        System.out.println(num);
    }
}
