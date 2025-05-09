package n3;

public class ShoeStore {




    public void sale(CallBackPaymentMethod callBackPaymentMethod, String product, int price){
        System.out.println("You have bought : " + product);
        callBackPaymentMethod.pay(price);
    }
}
