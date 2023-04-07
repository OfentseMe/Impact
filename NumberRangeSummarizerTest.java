package numberrangesummarizer;


import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberRangeSummarizerTest {

    @Test
    public void testCollect() {
        NumberRangeSummarizer summarizer = new CommaDelimitedNumbers();
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31));
        Set<Integer> actual = new HashSet<>(summarizer.collect(input));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSummarizeCollection() {
        NumberRangeSummarizer summarizer = new CommaDelimitedNumbers();
        Set<Integer> input = new HashSet<>(Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31));
        String expected = "1, 3, 6-8, 12-15, 21-24, 31";
        String actual = summarizer.summarizeCollection(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSummarizeEmptyCollection() {
        NumberRangeSummarizer summarizer = new CommaDelimitedNumbers();
        Set<Integer> input = new HashSet<>();
        String expected = "";
        String actual = summarizer.summarizeCollection(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSummarizeSingleNumberCollection() {
        NumberRangeSummarizer summarizer = new CommaDelimitedNumbers();
        Set<Integer> input = new HashSet<>(Arrays.asList(7));
        String expected = "7";
        String actual = summarizer.summarizeCollection(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSummarizeConsecutiveNumbers() {
        NumberRangeSummarizer summarizer = new CommaDelimitedNumbers();
        Set<Integer> input = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        String expected = "1-10";
        String actual = summarizer.summarizeCollection(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSummarizeNonConsecutiveNumbers() {
        NumberRangeSummarizer summarizer = new CommaDelimitedNumbers();
        Set<Integer> input = new HashSet<>(Arrays.asList(1, 2, 4, 5, 7, 8, 10));
        String expected = "1, 2, 4, 5, 7, 8, 10";
        String actual = summarizer.summarizeCollection(input);
        Assert.assertEquals(expected, actual);
    }
}
