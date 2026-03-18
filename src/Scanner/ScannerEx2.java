package Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ScannerEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("정수를 입력하세요: ");
        int a= Integer.parseInt((br.readLine()));
        int b= Integer.parseInt((br.readLine()));
        int c= 0;
        if (a>b){
            c=a;
        }else {
            c= b;
        }
        System.out.println(c);
    }
}
