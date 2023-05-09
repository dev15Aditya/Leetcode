package DailyChallenge;

public class subStringMaxVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)))
                count++;
        }
        max = count;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))
                count++;
            if (isVowel(s.charAt(i - k)))
                count--;
            max = Math.max(max, count);
        }
        return max;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u';
    }
}
