package Scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("문자열을 입력해보세요: ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            } else {
                System.out.println("입력한 문자열: " + str);
            }
        }

    }
}
