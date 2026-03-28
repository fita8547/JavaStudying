package Mathod;

public class Method3 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printfooter();
    }
    public  static void printHeader(){
        System.out.println("프로글매을 시작합니다 =");
        return; //void일 경우 생략 가능
    }

    public static void printfooter() {
        System.out.println("프로그램을 종료합니다");
    }
}
