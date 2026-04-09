import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N: 동물의 개수
        int n = scanner.nextInt();

        // 각 동물마다 아침 먹이량과 저녁 먹이량을 받음
        for (int i = 0; i < n; i++) {
            int morning = scanner.nextInt();  // 아침 먹이량
            int evening = scanner.nextInt();  // 저녁 먹이량

            // 하루 총 먹이량 (아침 + 저녁)
            int total = morning + evening;

            // 아침과 저녁 먹이량의 차이 (아침 - 저녁)
            int diff = morning - evening;

            // 결과 출력
            System.out.println(total + " " + diff);
        }

        scanner.close();
    }
}
