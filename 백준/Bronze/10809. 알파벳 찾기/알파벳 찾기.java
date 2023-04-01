import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[26]; // a~z 의 위치 정보를 담은 배열 생성
        for(int i = 0; i < arr.length;i++){
            arr[i]=-1; // 각 값 다 -1 넣어주기
        }

        String S = in.nextLine(); // S라는 문자열 주기

        for(int i = 0;i<S.length();i++){ // 반복문을 통해 문자열의 각 문자를 검사
            char ch = S.charAt(i); // charAt()을 통해 문자를 추출한 뒤 ch라는 변수에 저장

            // 동일 문자가 포함되어 있는 경우 처음 나타난 위치
            if(arr[ch-'a']==-1){ // arr 배열 인덱스는 ch가 갖고 있는 문자 인코딩값(=아스키코드값)에  'a'를 빼주어야  함
                arr[ch-'a'] = i;
            }
        }
        for(int val:arr){ //배열 출력
            System.out.print(val + " ");
        }
    }
}
