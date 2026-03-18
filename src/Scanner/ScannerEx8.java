package Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ScannerEx8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("정수를 입력하세요: ");
        int c=0;
        int a= Integer.parseInt((br.readLine()));
        int b= Integer.parseInt((br.readLine()));
        if (a>b){
            c=a;
            a=b;
            b=c;
        }
        for (int i=a; i<b; i++){
            System.out.print(i);
            System.out.print(',');
        }
        System.out.print(b);


    }
}
