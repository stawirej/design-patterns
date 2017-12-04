package behavioral.observer;

import java.util.List;
import java.util.Vector;

abstract class ObserverSubject {

    private final List<Observer> observers = new Vector<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public int countObservers() {
        return observers.size();
    }
}
