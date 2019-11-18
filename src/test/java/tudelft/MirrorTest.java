package tudelft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorTest {
    public String mirrorEnds(String string) {
        String mirror = "";
        int begin = 0;
        int end = string.length() - 1;
        for (; begin < end; begin++, end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += String.valueOf(string.charAt(end));
            } else {
                break;
            }
        }
        return begin == string.length() / 2 ? string : mirror;
    }

    @Test
    public void testMirrorEnds() throws Exception {
        assertEquals("ab", mirrorEnds("abXYZba"));
        assertEquals("a", mirrorEnds("abca"));
        assertEquals("aba", mirrorEnds("aba"));
        assertEquals("abba", mirrorEnds("abba"));
    }
} 
