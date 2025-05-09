package n3;

public class BankDebit implements CallBackPaymentMethod{
    public void pay(int price){
        System.out.println("you've paid " + price + "€ by bankdebit");
    }
}
