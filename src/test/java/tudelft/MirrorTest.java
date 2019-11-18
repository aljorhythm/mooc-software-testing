package tudelft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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


    public boolean gHappy(String str) {
        assert str != null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i - 1) == 'g') {
                    continue;
                }
                if (i + 1 < str.length() && str.charAt(i + 1) == 'g') {
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    @Test
    public void testGHappy() throws Exception {
        assertTrue(gHappy("xxggxx"));
        assertTrue(gHappy("xxggxx"));
        assertFalse(gHappy("xxggyygxx"));
        assertFalse(gHappy("xxggyygxx"));
        assertTrue(gHappy("gg"));
        assertFalse(gHappy("g"));
    }
} 
