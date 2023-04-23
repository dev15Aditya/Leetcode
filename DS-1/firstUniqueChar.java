public class firstUniqueChar {
    public static void main(String[] args) {
        // String str = "leetcode";
        String str = "loveleetcode";
        System.out.println(firstUniqChar(str));
    }
    public static int firstUniqChar(String s){
        int ans = Integer.MAX_VALUE;
        for(char c = 'a'; c<='z'; c++){
            int index = s.indexOf(c);
            if(index != -1 && index == s.lastIndexOf(c)){
                ans = Math.min(ans, index);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
