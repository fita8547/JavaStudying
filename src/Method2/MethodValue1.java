package Method2;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1=5;
        System.out.println("1. changerNumber 호출 전, num1: "+ num1);
        changeNumber(num1);
        System.out.println("1. changerNumber 호출 후, num1: "+ num1);

    }
    public static void changeNumber(int num2){
        System.out.println("2. changerNumber 호출 전, num2: "+ num2);
        num2 *=2;
        System.out.println("3. changerNumber 호출 후 num2: "+ num2);

    }
}