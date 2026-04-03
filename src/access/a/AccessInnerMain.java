package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AcessData data = new AcessData();
        data.publicField = 1;
        data.defalutfiled = 2;
        data.defalutMethod();
//        data.privateField =3;
//        data.privateMethod();
        data.innerAccess();
    }
}
