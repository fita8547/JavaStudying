package super1;

public class Child extends Parent{
    private String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }
    public void call(){
        System.out.println("value: " + value);
        System.out.println("super.value: " + super.value);
        hello();
        super.hello();
    }
}
