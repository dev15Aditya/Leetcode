package DailyChallenge;

public class similarString {
    public static void main(String[] args) {
        String[] strs = { "tars", "rats", "arts", "star" };
        System.out.println(numSimilarGroups(strs));
    }

    public static int numSimilarGroups(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                String temp = strs[i];
                strs[i] = null;
                count++;
                dfs(strs, temp);
            }
        }
        return count;
    }

    public static void dfs(String[] strs, String temp) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                if (isSimilar(strs[i], temp)) {
                    String temp2 = strs[i];
                    strs[i] = null;
                    dfs(strs, temp2);
                }
            }
        }
    }

    public static boolean isSimilar(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }
        return count == 2 || count == 0;
    }
}
