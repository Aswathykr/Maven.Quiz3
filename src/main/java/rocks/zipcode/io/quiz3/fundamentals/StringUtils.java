package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char chAtIdx = str.charAt(indexToCapitalize);
        return  str.substring(0, indexToCapitalize) +
                    Character.toUpperCase(chAtIdx) +
                    str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Character charAtIndex = Character.toLowerCase(baseString.charAt(indexOfString));
        return charAtIndex.equals(Character.toLowerCase(characterToCheckFor));
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> list = new HashSet<>();

        for (int i = 0; i < string.length() ; i++) {
            for(int j = i+1; j <= string.length(); j++){
                list.add(string.substring(i, j));
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
