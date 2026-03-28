package Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Quiz6_2113 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자를 입력하세요.");
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int sum =0;
        int mount = 0;
        for (int i =a; i<=b; i++){
            if (i%3==0 || i%5==0){
                sum+=i;
                mount+=1;
            }


        }
        System.out.print("sum : ");
        System.out.print(sum);
        System.out.println(" ");
        System.out.print("avg : ");
        System.out.print(sum/mount);
    }
}
