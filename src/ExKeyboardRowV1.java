import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ExKeyboardRowV1 {

    public static boolean duplicateCharacter(String word, char character, int i) {
        for (int j = 0; j < i; j++) {
            if (word.charAt(j) == character) {
                return false;
            }
        }
        return true;
    }

    public static String duplicateRemover(String words) {

        char[] ch = new char[words.length()];
        int k = 0;

        for (int i = 0; i < words.length(); i++) {
            if (duplicateCharacter(words, words.charAt(i), i)) {
                ch[k] = words.charAt(i);
                k++;
            }
        }

        String str = "";

        for (int i = 0; i < k; i++) {
            str = str + ch[i];
        }
        return str;
    }


    public static String arrangementString(String word) {

        char[] ch = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }

        int m = 0;
        int j = m + 1;

        Arrays.sort(ch);
        String str = "";

        for (int i = 0; i < word.length(); i++) {
            str = str + ch[i];
        }
        return str;
    }

    public static boolean checkIdentity(char character, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> finalWords = new ArrayList<>();

        String[] words = {"Hello", "Alaska", "Dad", "Peace"};

        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str3 = str3.toLowerCase();

        str1 = arrangementString(str1);
        str2 = arrangementString(str2);
        str3 = arrangementString(str3);


        String[] newWords = new String[words.length];

        for (int i = 0; i < newWords.length; i++) {
            newWords[i] = duplicateRemover(words[i].toLowerCase());
        }
        boolean check = false;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < newWords[i].length(); j++) {
                check = false;
                if (checkIdentity(newWords[i].charAt(j), str1)) {
                    check = true;
                } else {
                    break;
                }

            }

            if (check) {
                finalWords.add(words[i]);

            }
        }

            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < newWords[i].length(); j++) {
                    check = false;
                    if (checkIdentity(newWords[i].charAt(j), str2)) {
                        check = true;
                    } else {
                        break;
                    }

                }

                if (check) {
                    finalWords.add(words[i]);
                }
            }

            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < newWords[i].length(); j++) {
                    check = false;
                    if (checkIdentity(newWords[i].charAt(j), str3)) {
                        check = true;
                    } else {
                        break;
                    }

                }

                if (check) {
                    finalWords.add(words[i]);

                }
            }
            String[] newSt = new String[finalWords.size()];
            finalWords.toArray(newSt);
            for (int i = 0; i < newSt.length; i++) {
                System.out.println(newSt[i]);
            }
    }
}

