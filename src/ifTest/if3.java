package ifTest;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int a = sc.nextInt();

        if (a<=1){
            System.out.println("도보");
        } else if (a<=10) {
            System.out.println("자전거");
        } else if (a<=100) {
            System.out.println("자동차");
        } else{
            System.out.println("비행기");
        }
    }
}
