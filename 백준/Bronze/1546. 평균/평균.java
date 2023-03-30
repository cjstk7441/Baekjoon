import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(); // 시험 본 과목의 개수
        float[] arr = new float[num]; // 점수 저장하는 배열
        float max = 0; // 배열 중 최대값
        float avg = 0; // 점수 평균값

        for(int i = 0; i<arr.length;i++){ // 배열에 점수 저장
            arr[i] = in.nextInt();
            if(arr[i]>max){ // 배열에서 최대값 구하기
                max = arr[i];
            }
        }
        for(int j =0; j<arr.length;j++){ // 평균값 구하기 
            avg += (arr[j]/max*100)/num;
        }
        System.out.println(avg);
        }
    }