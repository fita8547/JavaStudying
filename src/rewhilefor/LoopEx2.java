package rewhilefor;
import java.util.Scanner;
public class LoopEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (true){
            System.out.println(i);
            if (i==9) {
                break;
            }
            i++;
        }
        for (int j=5; j <= 9; j++){
            System.out.println(j);
        }
    }
}
