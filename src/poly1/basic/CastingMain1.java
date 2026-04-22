package poly1.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        System.out.println("다운캐스팅");
        Parent poly1 = new Child();
        //poly1.childMaethod();
        Child child1 = (Child) poly1;
        poly1.parentMethod();

    }

}
