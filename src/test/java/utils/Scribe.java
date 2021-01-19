package utils;

import java.util.Arrays;

public class Scribe {
    public boolean isAnagram(String first, String second) {
        if (first.isEmpty() && second.isEmpty()) return true;
        if (first.length() != second.length()) return false;
        char[] firstChars, secondChars;
        firstChars = first.toCharArray();
        secondChars = second.toCharArray();
        Arrays.sort(firstChars);
        Arrays.sort(secondChars);
        return Arrays.equals(firstChars, secondChars);
    }
}
