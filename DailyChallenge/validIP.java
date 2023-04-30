package DailyChallenge;

public class validIP {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int n = game.length;
        boolean[] visited = new boolean[n];
        return dfs(game, 0, leap, visited);
    }

    public static boolean dfs(int[] game, int i, int leap, boolean[] visited) {
        if (i >= game.length) {
            return true;
        }
        if (i < 0 || game[i] == 1 || visited[i]) {
            return false;
        }
        visited[i] = true;
        return dfs(game, i + 1, leap, visited) || dfs(game, i - 1, leap, visited)
                || dfs(game, i + leap, leap, visited);
    }

}

class MyRegex {
    String pattern = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
}
