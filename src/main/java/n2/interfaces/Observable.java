package n2.interfaces;

public interface Observable {   //SUBJECT
    void subscribe(Observer observer); //add()
    void unsubscribe(Observer observer); //remove()
    void notifyObserver(String message);  // update()
}
