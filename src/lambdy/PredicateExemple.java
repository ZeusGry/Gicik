package lambdy;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateExemple {

    public static void main(String[] args) {
        Predicate<Integer> predicate = e -> IntStream.range(2, e/2)
                .anyMatch(stream -> !(e % stream != 0));
        checkTest(predicate, 10);
        checkTest(predicate, 11);
        checkTest(predicate, 12);
        checkTest(predicate, 13);
        checkTest(predicate, 14);
        checkTest(predicate, 15);
        checkTest(predicate, 16);
        checkTest(predicate, 17);

    }
    static void checkTest(Predicate<Integer> predicate, int a) {
        System.out.println(!predicate.test(a));
    }
}
