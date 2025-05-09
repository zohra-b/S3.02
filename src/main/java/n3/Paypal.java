package n3;

public class Paypal implements CallBackPaymentMethod{
    public void pay(int price){
        System.out.println("you've paid " + price +"€ by paypal");
    }
}
