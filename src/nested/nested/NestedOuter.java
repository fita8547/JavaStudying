package nested.nested;

public class NestedOuter {
    private static int outClassvalue = 3;
    private int outInstancevalue = 2;

    static class Nested{
        private int nesetedInstanceValue = 1;
        public void print(){
            System.out.println(nesetedInstanceValue);
            //System.out.println(outInstancevalue);
            System.out.println(NestedOuter.outClassvalue);
        }
    }
}
