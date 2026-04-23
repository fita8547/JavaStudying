package poly1.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = "+child.value);
        child.Method();

        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = "+parent.value);
        parent.Method();

        Parent poly = new Child();
        System.out.println("Child -> Parent");
        System.out.println("value = "+poly.value);
        poly.Method();
    }
}
