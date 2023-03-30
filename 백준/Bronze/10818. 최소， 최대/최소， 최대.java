import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] array = new int[N]; // 배열 입력받는 방법

        for(int i = 0; i<N; i++){
            array[i] = in.nextInt(); // 배열에 넣기
        }
        int max = array[0];
        int min = array[0];

        for(int j = 0; j<array.length;j++){
            if(array[j]>=max){
                max = array[j];
            }else if(array[j]<=min){
                min = array[j];
            }
        }
        System.out.println(min + " " + max);
    }
}