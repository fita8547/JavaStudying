package poly1.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("parent1 호출");
        String result1 =call1(parent);
        String result2 = call2(parent);

        compareResult(result1);
        compareResult(result2);
    }

    private static void compareResult(String result){
        System.out.println(result);
        if (result.equals("Child 인스턴스 맞음") ) {
            System.out.println("정확히 Child 인스턴스 맞음");
        }
        if (result.contains("Child")){
            System.out.println("Child  라는 단어가 포함됨");
        }
        if (result.equals("Child")){
            System.out.println("정확히 Child");
        }else {
            System.out.println("child와 정확히 같지는 않음");
        }
        System.out.println();
    }

    private static String call2(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child){
            child.childMethod();
            return  "Child 인스턴스 맞음";
        }else{
            return "Child 인스턴스 아님";
        }
    }

    private static String call1(Parent parent) {
        if (parent instanceof Child ) {
            Child child = (Child) parent;
            child.childMethod();
            return "child 인스턴스 맞음";
        } else {
            return "child로 변환 아님";
        }
    }
}
