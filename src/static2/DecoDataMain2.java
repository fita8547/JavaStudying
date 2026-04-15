package static2;

public class DecoDataMain2 {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        DecoData.statiCall();
        System.out.println("2.인스턴스 호출");
        DecoData deta1 = new DecoData();
        deta1.instanceCall();
        System.out.println("3.정적 호출");
        DecoData data2=new DecoData();
        data2.instanceCall();
        DecoData data3 = new DecoData();
        data3.staticCall();

    }
}
