package BiweeklyChallenge;

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */

public class FrequencyTracker {

    int[] map, freq;

    public FrequencyTracker() {
        map = new int[100001];
        freq = new int[100001];
    }

    public void add(int number) {
        if (map[number] > 0)
            freq[map[number]]--;

        map[number]++;
        freq[map[number]]++;
    }

    public void deleteOne(int number) {
        if (map[number] > 0) {
            freq[map[number]]--;
            map[number]--;
        }
        if (map[number] > 0)
            freq[map[number]]++;
    }

    public boolean hasFrequency(int frequency) {
        return freq[frequency] > 0;
    }
}
