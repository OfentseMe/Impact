package numberrangesummarizer;

import java.util.Collection;
import java.util.Set;

public interface NumberRangeSummarizer {

	Collection<Integer> collect(String input);

	String summarizeCollection(Collection<Integer> input);

	String summarizeCollection(Set<Integer> input);

}
