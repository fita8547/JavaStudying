package Quiz;

import java.util.Scanner;

public class Quiz1_2113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1.삽입,2.수정,3.삭제 숫자를 선택하세요.");
        String input = sc.nextLine();

        if (input == "1") {
            System.out.println("삽입을 선택하셨습니다.");
        } else if (input == "2") {
            System.out.println("수정을 선택하셨습니다.");
        } else if (input == "3") {
            System.out.println("삭제를 선택하셨습니다.");
        }
    }
}
