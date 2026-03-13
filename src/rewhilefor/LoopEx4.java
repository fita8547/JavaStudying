package rewhilefor;
import java.util.Scanner;

public class LoopEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // while문 버전
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            System.out.print(sum + " ");
            i++;
        }

        System.out.println();

        // for문 버전
        sum = 0;
        for (int j = 1; j <= n; j++) {
            sum += j;
            System.out.print(sum + " ");
        }

        sc.close();
    }
}