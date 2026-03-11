package ifTest;

import java.util.Scanner;

public class if7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c= switch (a){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11->30;
            case 2-> 28;
            default -> 0;
        };
        if (c==0){
            System.out.println("잘못된 입력입니다.");
        }else {
            System.out.println(c+"일");
        }
    }
}

