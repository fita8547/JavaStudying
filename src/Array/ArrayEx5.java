package Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ArrayEx5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c=0;
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int num= Integer.parseInt((br.readLine()));
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("정수를 입력하세요: ");
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }
        for (int i = 0; i < num; i++) {
            c+=arr[i];
        }


        System.out.print(c/num);

    }
}
