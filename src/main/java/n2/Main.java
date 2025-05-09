package n2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
      SubjectStockAgent stockAgents = new SubjectStockAgent();
        User user1 = new User("Rocio");
        User user2 = new User("Marta");
        User user3 = new User("Montse");


        stockAgents.addObserver(user1);
        stockAgents.addObserver(user2);
        stockAgents.addObserver(user3);

        stockAgents.stockFall();
        stockAgents.stockRise();

    }
}
