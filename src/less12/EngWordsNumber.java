package less12;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Найти количество слов, содержащих только символы латинского алфавита.
 */
public class EngWordsNumber {
    public static void main(String[] args) {

        String l = "Regular expressions opens перед вами возможности, о которых вы, возможно, даже не подозревали.";
        Matcher m = Pattern.compile("[A-Za-z]+").matcher(l);
        ArrayList<String> words = new ArrayList<>();
        while (m.find()) {
            words.add(l.substring(m.start(), m.end()));
        }

        System.out.println(getEngNum(words));
    }

    public static int getEngNum(ArrayList<String> words) {
        int num = 0;
        for (String word : words) {
           num++;
            }
        return num;
    }
}
