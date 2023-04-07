package numberrangesummarizer;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommaDelimitedNumbers implements NumberRangeSummarizer {

    @Override
    public Set<Integer> collect(String input) {
        if (input == null || input.isEmpty()) {
            return new LinkedHashSet<>();
        }
        String[] parts = input.split(",");
        Set<Integer> numbers = new LinkedHashSet<>();
        for (String part : parts) {
            try {
                int number = Integer.parseInt(part.trim());
                numbers.add(number);
            } catch (NumberFormatException e) {
            }
        }
        return numbers;
    }

    @Override
    public String summarizeCollection(Set<Integer> input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        Integer prev = null;
        StringBuilder rangeBuilder = null;
        for (Integer num : input) {
            if (prev == null) {
                builder.append(num);
            } else if (num == prev + 1) {
                if (rangeBuilder == null) {
                    rangeBuilder = new StringBuilder().append(prev).append("-");
                }
            } else {
                if (rangeBuilder != null) {
                    builder.append(",").append(rangeBuilder).append(num);
                    rangeBuilder = null;
                } else {
                    builder.append(",").append(num);
                }
            }
            prev = num;
        }
        if (rangeBuilder != null) {
            builder.append(",").append(rangeBuilder).append(prev);
        }
        return builder.toString();
    }

	@Override
	public String summarizeCollection(Collection<Integer> input) {
		// TODO Auto-generated method stub
		return null;
	}
}



