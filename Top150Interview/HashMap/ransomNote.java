package Top150Interview.HashMap;

import java.util.HashMap;

public class ransomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                if (count == 0) {
                    return false;
                }
                map.put(c, --count);
            } else {
                return false;
            }
        }
        return true;
    }
}
