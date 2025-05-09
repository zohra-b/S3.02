package n3;

public class PayGateTaskProcessor {

    public void payGateProcessor(CallBackPaymentMethod callBackPaymentMethod, int price){

        callBackPaymentMethod.pay(price);

    }
}
