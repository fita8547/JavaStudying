package access.a;

public class AcessData {
    public int publicField;
    int defalutfiled;
    private int privateField;
    public void publicMethod() {
        System.out.println("publicMethod 호출"+publicField);

    }
    void defalutMethod(){
        System.out.println("defalutMethod 호출"+defalutfiled);

    }
    private void pivateMethod(){
        System.out.println("privateMethod 호출"+privateField);
    }
    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defalutfiled = 200;
        privateField = 300;

        publicMethod();
        defalutMethod();
        pivateMethod();
    }
}
