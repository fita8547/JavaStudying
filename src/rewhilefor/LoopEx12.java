package rewhilefor;

public class LoopEx12 {
    public static void main(String[] args) {

        char ch = 'A';
        int c=0;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3-i+1; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            for (int t=1; t<i; t++) {
                System.out.print(c+" ");
                c+=1;
            }
            System.out.println();
        }

    }
}