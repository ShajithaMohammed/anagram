import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    private String wordToMatch;

    public Anagram(String word) {
        wordToMatch = word;
    }

    public List<String> match(List<String> list) {

        List<String> subList = new ArrayList<String>();

        char temp[] = wordToMatch.toLowerCase().toCharArray();
        char tempArray[];
        Arrays.sort(temp);
        String match = new String(temp).toLowerCase();

        for (String word : list) {
            if (!word.equalsIgnoreCase(wordToMatch)) {
                tempArray = word.toLowerCase().toCharArray();
                Arrays.sort(tempArray);
                if (match.equals(new String(tempArray))) {
                    subList.add(word);
                }
            }
        }
        return subList;
    }
}
