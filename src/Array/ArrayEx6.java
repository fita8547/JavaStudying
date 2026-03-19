package Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ArrayEx6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int num= Integer.parseInt((br.readLine()));
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("정수를 입력하세요: ");
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }
        int max1=arr[0];
        int min1=arr[0];
        for (int i = 1; i < num; i++) {
            if (max1 < arr[i]){
                max1 = arr[i];
            }
            if (min1 > arr[i]){
                min1 = arr[i];
            }
        }


        System.out.print("가장 큰값");
        System.out.println(max1);

        System.out.print("가장 작은값");
        System.out.println(min1);

    }
}
