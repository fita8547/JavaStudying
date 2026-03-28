package Method2;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance =10000;
        int dep =1000;
        balance += dep;
        System.out.println(dep+"원을 입급하셨습니다. 현재 잔액: "+balance+"원");
        int w =2000;
        if (balance>=w){
            balance -=w;
            System.out.println(w+"원을 출금했습니다 현재 잔액: "+balance+"원");
        }else{
            System.out.println("원을 출금하려 했으나 잔액이 부족합니다.");
        }
        System.out.println("최종잔액: "+balance+"원");
    }
}
