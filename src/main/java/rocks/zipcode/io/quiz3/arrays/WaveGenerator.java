package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        ArrayList<String> result = new ArrayList<>();
        if(str.length() > 0) {

            String lowercase = str.toLowerCase();

            if(Character.isLetter(lowercase.charAt(0))) {
                result.add(Character.toUpperCase(lowercase.charAt(0)) +
                        lowercase.substring(1));
            }
            for (int i = 1; i < str.length(); i++) {
                char chAtIdx = lowercase.charAt(i);
                if(Character.isLetter(chAtIdx)) {
                    result.add(lowercase.substring(0, i) +
                            Character.toUpperCase(chAtIdx) +
                            lowercase.substring(i + 1));
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
