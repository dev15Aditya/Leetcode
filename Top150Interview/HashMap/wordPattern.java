package Top150Interview.HashMap;

import java.util.HashMap;

public class wordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(WordPattern(pattern, str));
    }

    public static boolean WordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                String word = map.get(c);
                if (!word.equals(words[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(words[i])) {
                    return false;
                }
                map.put(c, words[i]);
            }
        }
        return true;
    }
}
