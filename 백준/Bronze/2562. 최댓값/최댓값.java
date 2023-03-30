import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] array = new int[9]; // 배열 입력받는 방법
        int max = 0;
        int index = 0;

        for(int i = 0; i<9;i++){
            int input = in.nextInt();
            array[i] = input;
        }

        for(int j =0; j<9; j++){
            if(array[j]>max){
                max = array[j];
                index = j +1;
            }
        }
        System.out.print(max + "\n" + index);
    }
}