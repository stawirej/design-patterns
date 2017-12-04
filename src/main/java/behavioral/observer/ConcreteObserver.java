package behavioral.observer;

final class ConcreteObserver implements Observer {

    private int notificationCount = 0;

    @Override
    public void update() {
        notificationCount++;
    }

    public int notificationCount() {
        return this.notificationCount;
    }
}
