package Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ArrayEx4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력하세요: ");
        int a= Integer.parseInt((br.readLine()));
        int b= Integer.parseInt((br.readLine()));
        int c= Integer.parseInt((br.readLine()));
        int d= Integer.parseInt((br.readLine()));
        int e= Integer.parseInt((br.readLine()));
        int[] array2= {a,b,c,d,e};

        System.out.print(array2[4]+","+array2[3]+","+array2[2]+","+array2[1]+","+array2[0]);
    }
}
