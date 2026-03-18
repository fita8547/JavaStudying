package Scanner;

import java.util.Scanner;

public class ScannerEx9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("상품 명을 입력하세요: ");
        String str = scanner.nextLine();

        System.out.print("가격만 입력해주세요(숫자): ");
        int intValue =scanner.nextInt();

        System.out.print("수량만 입력해주세요(숫자): ");
        int intbla =scanner.nextInt();

        int cell =0;
        while (true){
            System.out.print("1:상품 입력, 2:결제, 3 프로그램 종료. ");
            int option =scanner.nextInt();

            if (option == 1){
                System.out.println("상품 명을 입력하세요: ");
                String str1 = scanner.nextLine();

                if (str1.equals("스프링")){
                    System.out.println(30000);
                    cell+= 30000*intbla;
                } else if ("JPA".equals(str1)) {
                    System.out.println(40000);
                    cell+= 40000*intbla;

                } else if (str1 ==str) {
                    System.out.print(str);
                    cell+=intValue;
                } else{
                    System.out.println(" 잘모르겠어요 후원 금액 999999999원");
                    cell+= 999999999*intbla;
                }
            } else if (option == 2) {
                System.out.printf("결제할 금액은"+cell);
            } else if (option == 3) {
                System.out.println("프로그램을 종료해버릴꺼야 ");
                break;
            }
        }



    }
}
