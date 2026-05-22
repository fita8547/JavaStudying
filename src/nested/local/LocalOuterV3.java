package nested.local;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        // 1. 지역 클래스 정의
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        } // LocalPrinter 정의 끝

        // 2. 지역 클래스의 인스턴스 생성 및 반환
        Printer printer = new LocalPrinter();
        //localVar = 10;
        //praramiter = 20;
        return printer;
    } // process() 메서드 끝

    public static void main(String[] args) {
        LocalOuterV3 outer = new LocalOuterV3();
        Printer printer = outer.process(5);

        // 3. process() 메서드가 종료된 이후에 print()를 호출!
        printer.print();
    }
}