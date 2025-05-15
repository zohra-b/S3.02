package n2.observer;

import n2.interfaces.Observer;

public class StockAgent implements Observer {
    private String name;

    public StockAgent(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Hello " + name + ", we have a new message :\n" + message);
    }
}
