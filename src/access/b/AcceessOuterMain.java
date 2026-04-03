package access.b;

import access.a.AcessData;

public class AcceessOuterMain {
    public static void main(String[] args) {
        AcessData data = new AcessData();
        data.publicField = 1;
        data.publicMethod();

//        data.defalutfiled = 2;
//        data.defalutMethod();
//        data.privateField =3;
//        data.privateMethod();
        data.innerAccess();
    }
}
