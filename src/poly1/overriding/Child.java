package poly1.overriding;

public class Child extends Parent{
    public String value = "child";
    @Override
    public void Method() {
        System.out.println("Child.method");
    }
}
