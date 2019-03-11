package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {

        return Arrays.stream(array)
                .filter(value -> getNumberOfOccurrences(value) % 2 != 0)
                .findFirst().get();
    }

    public SomeType findEvenOccurringValue() {
        return Arrays.stream(array)
                .filter(value -> getNumberOfOccurrences(value) % 2 == 0)
                .findFirst().get();
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return Arrays.stream(array)
                .filter(value -> value == valueToEvaluate)
                .collect(Collectors.toList()).size();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        List<SomeType> list = Arrays.stream(array)
                .filter(value -> predicate.apply(value))
                .collect(Collectors.toList());
        ;
        return list.toArray((SomeType[])Array.newInstance(array[0].getClass(),list.size()));
    }
}
