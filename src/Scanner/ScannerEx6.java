package Scanner;

import java.util.Scanner;

public class ScannerEx6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 이름을 입력하세요: ");
        String str = scanner.nextLine();

        System.out.print("당신의 나이만 입력해주세요(숫자만): ");
        int intValue =scanner.nextInt();
        System.out.println("당신의 이름은 "+str+"이고"+" 나이는"+intValue+" 살입니다.");

    }
}
