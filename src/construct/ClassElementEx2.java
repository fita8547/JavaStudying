package construct;

public class ClassElementEx2 {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("잔고: " + account.getGetter());
    }
}

class Account {
    private int getter;



    public int deposit(int amount) {
        getter += amount;
        return getter;
    }

    public int withdraw(int amount) {
        if (getter < amount) {
            System.out.println("잔액 부족");
            return getter;
        }

        getter -= amount;
        return getter;
    }

    public int getGetter() {
        return getter;
    }
}