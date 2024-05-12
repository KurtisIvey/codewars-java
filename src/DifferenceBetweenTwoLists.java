import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DifferenceBetweenTwoLists {
    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
        // Create a list to store the difference between collections 'a' and 'b'
        List<Character> difference = new ArrayList<>();

        // Create a set to track characters that have been seen
        Set<Character> seenCharacters = new HashSet<>();

        // If collection 'a' is empty, return all elements of collection 'b'
        if (a.isEmpty()) {
            difference.addAll(b);
        } else {
            // Iterate through each character in collection 'a'
            for (Character character : a) {
                // Add the character to the difference list if it's not in collection 'b'
                // and it has not been seen before
                if (!b.contains(character) && !seenCharacters.contains(character)) {
                    difference.add(character);
                    // Add the character to the set of seen characters
                    seenCharacters.add(character);
                }
            }
            // Iterate through each character in collection 'b'
            for (Character character : b) {
                // Add the character to the difference list if it's not in collection 'a'
                // and it has not been seen before
                if (!a.contains(character) && !seenCharacters.contains(character)) {
                    difference.add(character);
                    // Add the character to the set of seen characters
                    seenCharacters.add(character);
                }
            }
        }

        // Sort the difference list alphabetically
        Collections.sort(difference);
        // Return the list of unique characters
        return difference;
    }
}