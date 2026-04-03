package exclass;

public class ExMain1 {
    public static void main(String[] args) {
        Job1 developer = new Job1("개잘자","IT회사");
        Person1 person = new Person1("홍길동", 18, developer);
        person.intoduce();
    }
}
