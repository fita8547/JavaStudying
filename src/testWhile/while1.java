package testWhile;

public class while1 {
    public static void main(String[] args) {
        int count = 0;
        count++;
        System.out.println("현재숫자는" +count);
        count++;
        System.out.println("현재숫자는" +count);
        count++;
        System.out.println("현재숫자는" +count);
        count++;

        count = 0;
        while (count< 3){
            count++;
            System.out.println("현재숫자는"+count);
        }

    }
}
