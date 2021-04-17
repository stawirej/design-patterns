package behavioral.state;

final class LoggedOut extends State {

    public LoggedOut(Portal2 portal) {

        super(portal);
    }

    @Override
    public void login() {

        portal.setState(new LoggedIn(portal));
    }

    @Override
    public void select() {

        System.out.println("LoggedOut.select");
    }

    @Override
    public void download() {

        System.out.println("LoggedOut.download");
    }

    @Override
    public void logout() {

        System.out.println("LoggedOut.logout");
    }


}
