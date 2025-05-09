package n3;

public class Main {
    public static void main(String[] args){
        ShoeStore shoeStore = new ShoeStore();
        CallBackPaymentMethod card = new CreditCard();
        CallBackPaymentMethod paypal = new Paypal();
        CallBackPaymentMethod bankDebit = new BankDebit();

        shoeStore.sale(card, "boots", 100);
        shoeStore.sale(paypal, "flipflop", 12);
        shoeStore.sale(bankDebit, "slippers", 25);

        shoeStore.sale(price ->
                            {System.out.println("you've paid " + price + "€ by LAMBDA ");}, "otro producto", 1);

    }
}
