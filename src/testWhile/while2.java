package testWhile;

public class while2 {
    public static void main(String[] args) {
        int a = 0;
        while(a< 10){
            System.out.println(a+" ");
            a++;
        }

        int b =10;
        while(b>0) {
            System.out.println(b+" ");
            b--;
        }


        /*
        while(true){무한루프}
         */
        int c =0;
        while(true){
            if(c>10){
                break;
            }
            System.out.println(c+" ");
            c++;
        }
    }
}
