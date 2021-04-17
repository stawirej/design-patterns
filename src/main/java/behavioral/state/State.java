package behavioral.state;

public abstract class State {

    protected final Portal2 portal;

    public State(Portal2 portal) {

        this.portal = portal;
    }

    public abstract void login();

    public abstract void select();

    public abstract void download();

    public abstract void logout();
}
