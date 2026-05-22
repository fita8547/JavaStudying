package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int value = 0;

        // 1. 지역 클래스 정의
        class LocalPrinter implements Printer {
            int localVar = 1;

            @Override
            public void print() {
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        } // 클래스 정의 끝

        // 2. 클래스 정의가 끝난 후, process() 메서드 내부에서 객체 생성 및 호출
        LocalPrinter printer = new LocalPrinter();
        printer.print(); // 인터페이스 변수명이 아닌 생성한 객체 변수명(printer)으로 호출!
    }

    public static void main(String[] args) {
        LocalOuterV2 outer = new LocalOuterV2();
        outer.process(2);
    }
}