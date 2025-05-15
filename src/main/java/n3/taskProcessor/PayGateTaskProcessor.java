package n3.taskProcessor;

import n3.interfaces.CallBackPaymentMethod;

public class PayGateTaskProcessor {

    public void payGateProcessor(CallBackPaymentMethod callBackPaymentMethod, int price){

        callBackPaymentMethod.pay(price);

    }
}
