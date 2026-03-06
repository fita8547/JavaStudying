package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";
        boolean reuslt1 = "hello".equals("hello");
        boolean reuslt2 = str1.equals("문자열1");
        boolean reuslt3 = str1.equals(str2);

        System.out.println("result1 = " + reuslt1);
        System.out.println("result2 = " + reuslt2);
        System.out.println("result3 = " + reuslt3);

    }
}
