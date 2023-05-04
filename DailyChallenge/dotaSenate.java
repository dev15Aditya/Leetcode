package DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class dotaSenate {
    public static void main(String[] args) {
        dotaSenate test = new dotaSenate();
        String senate = "RDD";
        System.out.println(test.predictPartyVictory(senate));
    }

    public String predictPartyVictory(String senate) {
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R')
                qr.add(i);
            else
                qd.add(i);
        }
        for (; !qr.isEmpty() && !qd.isEmpty();) {
            int r_i = qr.poll();
            int d_i = qd.poll();
            if (r_i < d_i)
                qr.add(r_i + n);
            else
                qd.add(d_i + n);
        }
        return qr.size() > qd.size() ? "Radiant" : "Dire";
    }
}
