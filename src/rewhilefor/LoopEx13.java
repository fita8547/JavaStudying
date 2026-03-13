package rewhilefor;

public class LoopEx13 {
    public static void main(String[] args) {

        for (int a = 1; a <= 5; a++) {
            int star;

            if (a <= 3) {
                star = a;
            } else {
                star = 6 - a;
            }

            for (int b = 1; b <= star; b++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}