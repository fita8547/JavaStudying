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

        int w =5;
        int b1= w++;
        System.out.println(w);
        System.out.println(b1);
        System.out.println(++b1);
        System.out.println(w + --b1);//원인 이 모르겠지만 안찍히죠

        int m= 2;
        int n= --a;
        System.out.println(m++);
        System.out.println(n--);

    }
}
