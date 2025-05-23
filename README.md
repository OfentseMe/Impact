📊 Number Range Summarizer

This project provides a utility to summarize a list of integers into ranges. The input is a comma-separated string, and the output is a summarized string where consecutive numbers are grouped into ranges (e.g., 1, 3, 6-8, 12-15, 21-24).

🧠 Project Components
1. Main Class
The Main.java file initializes the summarization process by passing a hardcoded comma-delimited string of integers and printing the summarized output.

2. CommaDelimitedNumbers Class
- The CommaDelimitedNumbers.java file implements the NumberRangeSummarizer interface:

- collect(String input): Parses the comma-separated input string into a Set<Integer>.

- summarizeCollection(Set<Integer> input): Summarizes the collection of integers, grouping consecutive numbers into ranges.

3. NumberRangeSummarizer Interface
- The NumberRangeSummarizer.java interface defines the contract for summarizers, with methods for collecting and summarizing numbers.

4. JUnit Tests
- The NumberRangeSummarizerTest.java file includes unit tests using JUnit to ensure correct functionality:

- Tests for collecting numbers from a string.

- Tests for summarizing collections, including handling edge cases like empty or single-number collections.

🔧 Key Functions
- Collecting numbers: Parses a comma-separated string into a set of integers.

- Summarizing collections: Groups consecutive numbers into ranges (e.g., 6-8 for 6, 7, 8).

🧪 Testing
Several JUnit tests ensure the accuracy of the summarization process:

1. Test for input: Validates input collection from a string.

2. Test for summarization: Verifies the correct summarization of integer collections into ranges.

3. Edge cases: Tests handle empty collections, single numbers, and non-consecutive numbers correctly.
