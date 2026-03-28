package Method2;

public class MethodEx {
    public static void main(String[] args) {
        int a =1;
        int b =2;
        int c =3;
        int x =15;
        int y = 25;
        int z = 35;
        int sum = a+b+c;
        System.out.println("avg1은 " + avg(sum));
        int sum1 = x+y+z;
        System.out.println("avg2는"+avg((sum1)));
    }
    public static double avg(int sum){
        return sum/3.0;
    }
}
