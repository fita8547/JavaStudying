package Array;

import java.util.Scanner;

public class ArrayEx10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int count = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int menu = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            if (menu == 1) {
                if (count >= 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요:");
                String name = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요:");
                int price = scanner.nextInt();
                scanner.nextLine(); // 버퍼 비우기

                productNames[count] = name;
                productPrices[count] = price;
                count++;

            } else if (menu == 2) {
                if (count == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                }

            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }

        scanner.close();
    }
}