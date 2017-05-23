package behavioral.strategy;

final class Context {

    private final Strategy strategy;

    Context(final Strategy strategy) {
        this.strategy = strategy;
    }

    String executeStrategy() {
        return strategy.execute();
    }
}
