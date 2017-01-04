/**
 * Created by jeff on 1/3/17.
 */
public class Palindrome {
    public boolean isPalindrome(String word) {
        String replace = word.replaceAll("[^A-Za-z0-9]", "");
        if(replace.length() <= 1){
            return true;
        } else {
            String first = replace.substring(0, 1);
            String last = replace.substring(replace.length() - 1);
            if (first.equalsIgnoreCase(last)) {
                return isPalindrome(replace.substring(1, replace.length() - 1));

            }
        }

               return false;
            }
    }

