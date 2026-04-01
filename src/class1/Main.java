package class1;

//public class Main {
//    public static void main(String[] args) {
//        student s= new student("카라나",2101,2);
//        s.introduce();
//    }
//}

import java.util.Scanner;

//public class Main{
//    public static void main(String[] args) {
//        Book b = new Book("흰","한강",15000);
//        System.out.println("도서명: "+b.title+", 작가:"+b.author+b.price+"원");
//    }
//}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("책 제목을 입력하세요: ");
        String title =sc.nextLine();

        System.out.println("저자를 입력해주세요: ");
        String author = sc.nextLine();

        System.out.println("가격을 입력하세요: ");
        int price = sc.nextInt();

        Book b =new Book(title, author , price);
        b.info();
    }
}
