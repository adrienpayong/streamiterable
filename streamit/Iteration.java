import reactor.core.publisher.Flux;
import java.util.Arrays;
public class Iteration {
    public static void main(String[] args) {
        // Create a Flux from a list of integers
        Flux<Integer> numbers_Flux = Flux.fromIterable(Arrays.asList(12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24));

        // Filter numbers that are multiple of three and triple their values
        Flux<Integer> tripleMultipleofthreeNumbers = numbers_Flux
                .filter(n -> n % 3 == 0)
                .map(n -> n * 3);
        // Subscribe to the Flux to consume the data
        tripleMultipleofthreeNumbers.subscribe(
                value -> System.out.println("Received: " + value),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Completed")
        );
    }
}

