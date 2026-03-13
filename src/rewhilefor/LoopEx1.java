package rewhilefor;

public class LoopEx1 {
    public static void main(String[] args) {
        int sum =0;
        int i = 1;
        while (true){
            sum += i;
            System.out.println("i="+i+"sum="+sum);
            if (i==3) {
                break;
            }
            i++;
        }
        sum=0;
        for (int j=1; j <= 3; j++){
            sum+=j;
            System.out.println("i="+i+"sum="+sum);
        }
    }
}
