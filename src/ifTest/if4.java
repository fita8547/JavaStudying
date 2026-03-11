package ifTest;

import java.util.Scanner;

public class if4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (a == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else if (a > 0) {
            System.out.println("환전할 금액은" + a * 1.47 + "입니다.");
        }
    }
}

