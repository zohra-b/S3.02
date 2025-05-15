package n3.callBackHandlers;

import n3.interfaces.CallBackPaymentMethod;

public class Paypal implements CallBackPaymentMethod {
    public void pay(int price){
        System.out.println("you've paid " + price +"€ by paypal");
    }
}
