package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] wordArray = str.split(" ");
        String endResult = "";
        for(String word : wordArray) {
            String result = "";
            if (VowelUtils.startsWithVowel(word)) {
                result = word + "way";
            } else {
                Integer vowelIndex = VowelUtils.getIndexOfFirstVowel(word);
                if(vowelIndex == null){
                    result = word + "ay";
                }else {
                    result = word.substring(vowelIndex) +
                            word.substring(0, vowelIndex)
                            + "ay";
                }
            }
            endResult = endResult + result + " ";
        }
        return endResult.substring(0, endResult.length() -1);
    }
}
