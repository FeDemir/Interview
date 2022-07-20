package Tests;

import java.util.Arrays;

public class WordCountsTask {
    public static void main(String[] args) {
        String str = "Yesterday I drove to San Diego and went surfing";
        System.out.println("wordCount() = " + wordCount(str));
        System.out.println("wordCounts() = " + Arrays.toString(wordCounts(str)));

    }
    public static int wordCount(String str) {
        return str.split(" ").length;
    }
    public static int[] wordCounts(String str) {
        String[] words = str.split(" ");
        int[] counts = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            counts[i] = words[i].length();
        }
        Arrays.sort(counts);
        return counts;
    }
}
