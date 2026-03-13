package rewhilefor;
import java.util.Scanner;
public class LoopEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number123 = sc.nextInt();
        if (number123%2==1){
            number123+=1;
        }
        int i = 0;

        while (true){

            System.out.println(number123);
            number123+=2;
            if (i==4) {
                break;
            }
            i++;
        }

        int number1234 = sc.nextInt();
        if (number1234%2==1){
            number1234+=1;

        for (int j=0; j < 5; j++){
            System.out.println(number1234);
            number1234+=2;
        }

        }
    }

}
