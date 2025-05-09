package n2;

import java.util.ArrayList;
import java.util.List;

public class SubjectStockAgent {
    private List<Observer> observers = new ArrayList<>();


    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    private void notifyObserver(String message){
        for(Observer observer : observers){
            observer.update(message);
        }
    }

    public void stockRise(){
        notifyObserver("the stock market is rising");
    }

    public void stockFall(){
        notifyObserver("the stock market is falling");
    }

}
