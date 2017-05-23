package behavioral.strategy;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.Test;

class StrategyScenarios {

    @Test
    void useFirstStrategy() {
        // Given
        Context context = new Context(new FirstConcreteStrategy());

        // When
        String output = context.executeStrategy();

        // Then
        then(output).isEqualTo("FirstConcreteStrategy");
    }

    @Test
    void useSecondStrategy() {
        // Given
        Context context = new Context(new SecondConcreteStrategy());

        // When
        String output = context.executeStrategy();

        // Then
        then(output).isEqualTo("SecondConcreteStrategy");
    }
}