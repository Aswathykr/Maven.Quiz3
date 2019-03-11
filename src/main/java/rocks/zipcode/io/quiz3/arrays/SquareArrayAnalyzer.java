package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        Arrays.sort(input);
        Arrays.sort(squaredValues);
        Integer[] squareResult = Arrays.stream(input)
                .map(number -> number*number)
                .toArray(Integer[]::new);

        return Arrays.equals(squaredValues, squareResult);
    }
}
