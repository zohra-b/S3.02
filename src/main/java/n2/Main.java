package n2;

import n2.observer.StockAgent;
import n2.subject.Subject;

public class Main {
    public static void main(String[] args){
      Subject stockAgents = new Subject();
        StockAgent user1 = new StockAgent("Rocio");
        StockAgent user2 = new StockAgent("Marta");
        StockAgent user3 = new StockAgent("Montse");


        stockAgents.subscribe(user1);
        stockAgents.subscribe(user2);
        stockAgents.subscribe(user3);
        stockAgents.stockFall();

        System.out.println("\n");
        stockAgents.unsubscribe(user1);
        stockAgents.stockRise();

    }
}
