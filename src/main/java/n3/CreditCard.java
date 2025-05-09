package n3;

public class CreditCard implements CallBackPaymentMethod{
    public void pay(int price){
        System.out.println("you've paid " + price + "€ by credit card");
    }
}
