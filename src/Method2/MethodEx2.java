package Method2;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world";
        banboc(3,message);
        banboc(5,message);

        }
    public static double banboc(double a, String message) {
        for (int i = 0; i < a; i++) {
            System.out.println(message);
        }
        return a;
    }
}
