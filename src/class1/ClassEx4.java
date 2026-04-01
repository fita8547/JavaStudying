package class1;

public class ClassEx4 {
    public static void main(String[] args) {

        ProductOrder p1 = new ProductOrder("두부", 2000, 2);
        ProductOrder p2 = new ProductOrder("김치", 5000, 1);
        ProductOrder p3 = new ProductOrder("콜라", 1500, 2);

        // 출력
        p1.showOrder();
        p2.showOrder();
        p3.showOrder();

        // 총합 계산
        int total = p1.getTotalPrice() + p2.getTotalPrice() + p3.getTotalPrice();

        System.out.println("총 결제 금액: " + total);
    }
}