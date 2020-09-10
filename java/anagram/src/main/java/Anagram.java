import java.util.*;

public class Anagram {
    private final String anagram;
    private final String sortedAnagram;

    public Anagram(String anagram) {
        this.anagram = anagram.toLowerCase();
        this.sortedAnagram = sortString(this.anagram);
    }

    public List<String> match(List<String> candidates) {
        final List<String> matches = new ArrayList<>(candidates.size());

        candidates.forEach(candidate -> {
            final String sortedCandidate = sortString(candidate.toLowerCase());

            if (sortedCandidate.equals(sortedAnagram)
                    && !candidate.toLowerCase().equals(anagram))
                matches.add(candidate);
        });
        return matches;
    }

    private String sortString(String unsortedString) {
        final char[] charArr = unsortedString.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
