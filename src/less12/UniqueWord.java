package less12;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueWord {
    public static void main(String[] args) {

        String l = "Регулярные выражения откроют перед вами возможности, о которых вы, возможно, даже не подозревали.";
        Matcher m = Pattern.compile("[A-Za-zА-Яа-я0-9]+").matcher(l);
        ArrayList<String> words = new ArrayList<>();
        while (m.find()) {
            words.add(l.substring(m.start(), m.end()));
        }

        System.out.println(getWord(words));
    }

    public static int getNumbChar(String word) {
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            characters.add(word.charAt(i));
        }
        return characters.size();
    }

    public static String getWord(ArrayList<String> words) {
        String str = " ";
        int charNumb = 999;
        for (String word : words) {
            int j = getNumbChar(word);
            if (j < charNumb) {
                charNumb = j;
                str = word;
            }
        }
        return str;
    }
}


