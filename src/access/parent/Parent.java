package access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }
    protected void protectedMethod(){
        System.out.println("Parent.protectedMethod");
    }
    public void printParent(){
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue="+publicValue);
        System.out.println("protected="+protectedValue);
        System.out.printf("defaultValue=",defaultValue);
        System.out.printf("privateValue=",privateValue);
        defaultMethod();
        privateValue();
    }

    private void defaultMethod() {
        System.out.println("Parents.defalutMethod");
    }
    private void privateValue() {
        System.out.println("Parents.privateMethod");
    }
}
