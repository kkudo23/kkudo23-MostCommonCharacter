import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> charCt = new HashMap<>();
        for (int i =0; i<str.length();i++) {
            char ch = str.charAt(i);
            if (!charCt.containsKey(ch)) {
                charCt.put(ch, 1);
            } else {
                charCt.put(ch, charCt.get(ch)+1);
            }
        }
        int max = 0;
        char ret = ' ';
        for (Map.Entry<Character, Integer> e: charCt.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                ret = e.getKey();
            }
        }
        return ret;
    }
}
