import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] array = new int[N]; // 배열 입력받는 방법
        int cnt = 0;

        for(int i = 0; i<N; i++){
            array[i] = in.nextInt(); // 배열에 넣기
        }

        int v = in.nextInt(); // 사용자가 선택

        for(int j = 0; j<array.length;j++){
            if(v==array[j]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}