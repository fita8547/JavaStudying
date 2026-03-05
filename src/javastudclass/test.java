package javastudclass;

public class test {
    public static void main(String[] args) {
        byte a = 3;
        byte b = 5;
        //byte c = 130; -127범위가 넘어가서 int로 바꿔야됨
        byte d = (byte)(a + b);

        long e = 100;

        float f = 3.5f;

        System.out.printf(String.valueOf(a));
        System.out.printf(String.valueOf(b));
        System.out.printf(String.valueOf(d));
        System.out.printf(String.valueOf(e));
        System.out.printf(String.valueOf(f));
    }
}
