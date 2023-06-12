package DailyChallenge;

public class MyHashSet {
    /** Initialize your data structure here. */
    private int size;
    private int[] hashSet;

    public MyHashSet() {
        size = 1000001;
        hashSet = new int[size];

        for (int i = 0; i < size; i++) {
            hashSet[i] = -1;
        }
    }

    public void add(int key) {
        hashSet[key] = key;
    }

    public void remove(int key) {
        hashSet[key] = -1;
    }

    public boolean contains(int key) {
        return hashSet[key] != -1;
    }
}
