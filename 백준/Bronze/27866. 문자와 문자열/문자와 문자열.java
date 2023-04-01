import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] S = in.next().split("");
        int x = in.nextInt();
        System.out.println(S[x-1]);
        }
    }
