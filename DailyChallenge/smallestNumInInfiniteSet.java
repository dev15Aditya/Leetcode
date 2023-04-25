package DailyChallenge;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class smallestNumInInfiniteSet {
    int cur;
    Set<Integer> s;

    public smallestNumInInfiniteSet() {
        cur = 1;
        s = new HashSet<>();
    }

    public int popSmallest() {
        if (!s.isEmpty()) {
            int res = Collections.min(s);
            s.remove(res);
            return res;
        } else {
            cur++;
            return cur - 1;
        }
    }

    public void addBack(int num) {
        if (cur > num) {
            s.add(num);
        }
    }

    public static void main(String[] args) {
        // Input
        // ["SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest",
        // "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest"]
        // [[], [2], [], [], [], [1], [], [], []]

        // Output
        // [null, null, 1, 2, 3, null, 1, 4, 5]

        String[] inp = { "SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack",
                "popSmallest", "popSmallest", "popSmallest" };
        int[][] inp2 = { {}, { 2 }, {}, {}, {}, { 1 }, {}, {}, {} };

        smallestNumInInfiniteSet obj = new smallestNumInInfiniteSet();
        // print null also in output
        for (int i = 0; i < inp.length; i++) {
            if (inp[i].equals("SmallestInfiniteSet")) {
                System.out.println("null");
            } else if (inp[i].equals("addBack")) {
                obj.addBack(inp2[i][0]);
                System.out.println("null");
            } else if (inp[i].equals("popSmallest")) {
                System.out.println(obj.popSmallest());
            }
        }

    }
}
