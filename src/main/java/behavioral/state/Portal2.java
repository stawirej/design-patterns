package behavioral.state;

final class Portal2 {

    private State state;

    public Portal2() {

        state = new LoggedOut(this);
    }

    public void login() {

        state.login();
    }

    public void select() {

        state.select();
    }

    public void download() {

        state.download();
    }

    public void logout() {

        state.logout();
    }

    protected void setState(State state) {

        this.state = state;
    }
}
