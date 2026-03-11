package ifTest;

import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >=9) {
            System.out.println("어바웃타임");
        } else if (a >= 8) {
            System.out.println("토이스토리");
        } else if (a >= 7) {
            System.out.println("고질라");
        }
    }
}

