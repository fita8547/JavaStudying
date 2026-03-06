//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int a =5;
        a= a+5;
        a=a-2;
        a=a * 4;
        a=a/3;
        a=a%5;
        System.out.println(a);
        int num1 = 5, num2= 10;
        int result = num1 -num2 >0 ? num1 : num2;
        System.out.println("두 정수 중 더 큰 정수는"+result+"입니다");
    }
}