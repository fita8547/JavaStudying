package javastudclass;

public class HelloJava { // 클래스 이름
    public static void main(String[] args) { // 프로그램의 시작점
        int value1 =3;
        {
            int value2 = 5;
            System.out.printf(String.valueOf(value1));
            System.out.printf(String.valueOf(value2));

            int a = 100; //정수
            double b = 10.5; //실수
            boolean c= true;//참과 거짓을 판단
            char d= 'A'; //문자 하나를 사용
            String e ="Hello Java"; //문자 열 큰 따옴표를 사용
        }
        System.out.printf(String.valueOf(value1));
    }
}
