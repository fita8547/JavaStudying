package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;
    public static void statiCall(){
        staticValue++;
        staticMethod();
    }
    public void instanceCall(){
        instanceValue++;
        instanceMethod();
        staticValue++;
        instanceMethod();
    }
    private void instanceMethod(){
        System.out.println("instanceBalue="+instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue="+staticValue);
    }

    public void staticCall() {
    }
}
