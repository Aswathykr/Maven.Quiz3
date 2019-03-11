package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        word = word.toLowerCase();

        boolean vowelFound = false;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(isVowel(ch)){
                vowelFound = true;
                break;
            }
        }
        return vowelFound;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        word = word.toLowerCase();

        Integer vowelIdx = null;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(isVowel(ch)){
                vowelIdx = i;
                break;
            }
        }
        return vowelIdx;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        character = Character.toLowerCase(character);
        return ( character == 'a' || character == 'e' ||
                character == 'i' || character == 'o' || character == 'u');
    }
}
