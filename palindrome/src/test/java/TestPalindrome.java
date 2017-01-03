import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jeff on 1/3/17.
 */
public class TestPalindrome {

    Palindrome palindrome;

    @Before
    public void setup(){
        palindrome = new Palindrome();
    }

    @Test
    public void testSimpleTrue(){
        assertTrue(palindrome.isPalindrome("racecar"));
    }

    @Test
    public void testSimpleFalse(){
        assertFalse(palindrome.isPalindrome("hello"));
    }

    @Test
    public void testComplexTrue(){
        assertTrue(palindrome.isPalindrome("Lisa Bonet ate no basil."));
    }

    @Test
    public void testComplexFalse(){
        assertFalse(palindrome.isPalindrome("Never attribute to malice what can easily be explained by ignorance"));
    }
}
