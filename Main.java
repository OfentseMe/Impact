package numberrangesummarizer;

import java.util.Set;


public class Main {
    public static void main(String[] args) {
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        CommaDelimitedNumbers summarizer = new CommaDelimitedNumbers();
        Set<Integer> numbers = summarizer.collect(input);
        String summary = summarizer.summarizeCollection(numbers);
        System.out.println(summary);
    }
}
