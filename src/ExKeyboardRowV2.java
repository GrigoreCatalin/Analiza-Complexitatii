import java.util.ArrayList;
import java.util.Arrays;

public class ExKeyboardRowV2 {
    public static String[] findWords(String[] words) {
        ArrayList<String> suitableWords = new ArrayList<>();

        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";



        for (int j = 0; j < words.length; j++) {
            int s1 = 0; int s2 = 0; int s3 = 0;

            for (int i = 0; i < words[j].length(); i++) {
                if (str1.contains(("" + words[j].charAt(i)).toLowerCase())) {
                    s1++;
                } else if (str2.contains(("" + words[j].charAt(i)).toLowerCase())) {
                    s2++;
                } else if (str3.contains(("" + words[j].charAt(i)).toLowerCase())) {
                    s3++;
                }
            }
            if (s1 == words[j].length() || s2 == words[j].length() || s3 == words[j].length()) {
                suitableWords.add(words[j]);
            }
        }
        String[] newString = new String[suitableWords.size()];
        return suitableWords.toArray(newString);

    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] newWords = findWords(words);

        for (int i = 0; i < newWords.length; i++) {
            System.out.print(newWords[i] + " ");
        }
    }
}
