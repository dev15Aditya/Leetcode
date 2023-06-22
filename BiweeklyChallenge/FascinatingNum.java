package BiweeklyChallenge;

public class FascinatingNum{
    public static void main(String[] args) {
        int n = 11;
        System.out.println(isFascinating(n));
    }

    public static boolean isFascinating(int n){
        String num = Integer.toString(n) + Integer.toString(n*2) + Integer.toString(n*3);
        int[] freq = new int[10];
        for(int i=0; i<num.length(); i++){
            freq[num.charAt(i) - '0']++;
        }
        for(int i=1; i<10; i++){
            if(freq[i] != 1) return false;
        }
        return true;
    }
}