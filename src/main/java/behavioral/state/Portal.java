package behavioral.state;

final class Portal {

    private final static int USER_LOGGED_IN = 0;
    private final static int USER_NOT_LOGGED_IN = 1;
    private final static int PRODUCT_SELECTED = 2;
    private final static int PRODUCT_DOWNLOADED = 3;

    private int state = USER_NOT_LOGGED_IN;

    public void login() {
        if (state == USER_NOT_LOGGED_IN) {
            System.out.println("User logged in.");
            state = USER_LOGGED_IN;
        } else if (state == USER_LOGGED_IN) {
            System.out.println("User logged in.");
        } else if (state == PRODUCT_SELECTED) {
            System.out.println("User not logged in.");
        } else if (state == PRODUCT_DOWNLOADED) {
            System.out.println("User not logged in.");
        }
    }

    public void select() {
        if (state == USER_NOT_LOGGED_IN) {
            System.out.println("User not logged in.");
        } else if (state == USER_LOGGED_IN) {
            System.out.println("Select product.");
            state = PRODUCT_SELECTED;
        } else if (state == PRODUCT_SELECTED) {
            System.out.println("Product selected.");
        } else if (state == PRODUCT_DOWNLOADED) {
            System.out.println("Product not selected.");
        }
    }

    public void download() {
        if (state == USER_NOT_LOGGED_IN) {
            System.out.println("User not logged in.");
        } else if (state == USER_LOGGED_IN) {
            System.out.println("Select product.");
        } else if (state == PRODUCT_SELECTED) {
            System.out.println("Product downloaded.");
            state = PRODUCT_DOWNLOADED;
        } else if (state == PRODUCT_DOWNLOADED) {
            System.out.println("Select product.");
        }
    }

    private void test() {

    }
}
