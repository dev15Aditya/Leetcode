package Hashmap;

import java.util.HashMap;

public class romantoInt {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res -= map.get(s.charAt(i));
            } else {
                res += map.get(s.charAt(i));
            }
        }
        return res;
    }

    // public static int romanToInt(String s) {
    // int[] nums = new int[s.length()];
    // int sum = 0;
    // for (int i = 0; i < s.length(); i++) {
    // switch (s.charAt(i)) {
    // case 'I':
    // nums[i] = 1;
    // break;
    // case 'V':
    // nums[i] = 5;
    // break;
    // case 'X':
    // nums[i] = 10;
    // break;
    // case 'L':
    // nums[i] = 50;
    // break;
    // case 'C':
    // nums[i] = 100;
    // break;
    // case 'D':
    // nums[i] = 500;
    // break;
    // case 'M':
    // nums[i] = 1000;
    // break;
    // }
    // }
    // for (int i = 0; i < nums.length - 1; i++) {
    // if (nums[i] < nums[i + 1]) {
    // sum -= nums[i];
    // } else {
    // sum += nums[i];
    // }
    // }
    // return sum + nums[nums.length - 1];
    // }
}