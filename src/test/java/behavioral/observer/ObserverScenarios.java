package behavioral.observer;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

final class ObserverScenarios {

    @Nested
    class AddObserverScenarios {

        @Test
        void addObserver() {
            // Given
            final Observer concreteObserver = new ConcreteObserver();
            final ObserverSubject subject = new ConcreteSubject();

            // When
            subject.addObserver(concreteObserver);

            // Then
            then(subject.countObservers()).isEqualTo(1);
        }

        @Test
        void addMultipleObservers() {
            // Given
            final Observer firstConcreteObserver = new ConcreteObserver();
            final Observer secondConcreteObserver = new ConcreteObserver();
            final ObserverSubject subject = new ConcreteSubject();

            // When
            subject.addObserver(firstConcreteObserver);
            subject.addObserver(secondConcreteObserver);

            // Then
            then(subject.countObservers()).isEqualTo(2);
        }
    }

    @Nested
    class DeleteObserverScenarios {

        @Test
        void deleteObserver() {
            // Given
            final Observer firstConcreteObserver = new ConcreteObserver();
            final Observer secondConcreteObserver = new ConcreteObserver();
            final ObserverSubject subject = new ConcreteSubject();
            subject.addObserver(firstConcreteObserver);
            subject.addObserver(secondConcreteObserver);

            // When
            subject.deleteObserver(firstConcreteObserver);

            // Then
            then(subject.countObservers()).isEqualTo(1);
        }
    }

    @Nested
    class NotifyObservers {

        @Test
        void notifyObserver() {
            // Given
            final Observer concreteObserver = new ConcreteObserver();
            final ObserverSubject subject = new ConcreteSubject();
            subject.addObserver(concreteObserver);

            // When
            subject.notifyObservers();

            // Then
            then(((ConcreteObserver) concreteObserver).notificationCount()).isEqualTo(1);
        }

        @Test
        void notifyObservers() {
            // Given
            final Observer firstConcreteObserver = new ConcreteObserver();
            final Observer secondConcreteObserver = new ConcreteObserver();
            final ObserverSubject subject = new ConcreteSubject();
            subject.addObserver(firstConcreteObserver);
            subject.addObserver(secondConcreteObserver);

            // When
            subject.notifyObservers();

            // Then
            then(((ConcreteObserver) firstConcreteObserver).notificationCount()).isEqualTo(1);
            then(((ConcreteObserver) secondConcreteObserver).notificationCount()).isEqualTo(1);
        }
    }
}
