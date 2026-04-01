package class1;

class ProductOrder {

    private String name;
    private int price;
    private int quantity;

    // 생성자
    public ProductOrder(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // 주문 정보 출력
    public void showOrder() {
        System.out.println("상품명: " + name + ", 가격: " + price + ", 수량: " + quantity);
    }

    // 총 가격 (이게 핵심)
    public int getTotalPrice() {
        return price * quantity;
    }
}