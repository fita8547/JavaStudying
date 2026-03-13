package rewhilefor;



public class LoopEx6 {
    public static void main(String[] args) {
        int j=0;
        // for문 버전
        for (int i = 0; ; i++) {
            System.out.println(j);
            j+=2;
            if (j==10){
                continue;
            }
            if (j==12){
                break;
            }
        }

    }
}