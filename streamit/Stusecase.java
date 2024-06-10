import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
public class Stusecase {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> mult_tree_num = Arrays.asList(12,13,14,15,16,17,18,19,20,21,22,23,24);
        // Use Java Stream to filter numbers multiple of three and triple their values
        List<Integer> tripleMultipleofthreeNumbers = mult_tree_num.stream()
                .filter(n -> n % 3 == 0)
                .map(n -> n * 3)
                .collect(Collectors.toList());
        // Print the result
        System.out.println(tripleMultipleofthreeNumbers); // Output: [36, 45, 54, 63, 72]
    }
}
