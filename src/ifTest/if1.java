package ifTest;

import java.util.Scanner;
public class if1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        if (a>10000){
            a-=1000;
        }
        if (b<=10){
            a-=1000;
        }
        System.out.println(a);
    }
}
