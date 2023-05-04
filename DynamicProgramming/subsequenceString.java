package DynamicProgramming;

public class subsequenceString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ahbgdc";
        System.out.println(isSubsequence(s1, s2));
    }

    public static boolean isSubsequence(String s, String t) {
        int count = 0;
        int slength = s.length(), i;
        if (s.length() == 0)
            return true;
        for (i = 0; i < t.length(); i++) {
            if (s.charAt(count) == t.charAt(i)) {
                count++;

                if (count == slength)
                    return true;
            }
        }

        return false;
    }

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0)
                count++;
            n = n >>> 1;
        }
        return count;
    }
}