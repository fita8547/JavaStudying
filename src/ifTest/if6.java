package ifTest;

import java.util.Scanner;

public class if6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input == "A") {
            System.out.println("탁월한 성과입니다.");
        } else if (input == "B") {
            System.out.println("좋은 성과입니다.");
        } else if (input == "C") {
            System.out.println("준수한 성과입니다.");
        } else if (input =="D") {
            System.out.println("향상이 필요해보입니다.");
        } else if (input == "F") {
            System.out.println("불합격입니다.");
        }else {
            System.out.println("잘못된 학점입니다.");
        }
    }
}

