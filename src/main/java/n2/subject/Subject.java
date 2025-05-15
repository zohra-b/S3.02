package n2.subject;

import n2.interfaces.Observable;
import n2.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable {
    private List<Observer> observers = new ArrayList<>();


    public void subscribe(Observer o){
        observers.add(o);
    }

    public void unsubscribe(Observer o){
        observers.remove(o);
    }

    public void notifyObserver(String message){
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
