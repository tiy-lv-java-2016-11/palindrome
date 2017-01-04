/**
 * Created by jeff on 1/3/17.
 */
public class Palindrome {

    public boolean isPalindrome(String word){
        word = word.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int length = word.length();

        //Recursive way
//        if (length < 2){
//            return true;
//        }
//        if(word.substring(0, 1).equals(word.substring(length - 1, length))){
//            return isPalindrome(word.substring(1, length - 1));
//        }
//        else{
//            return false;
//        }

        //Iterative
        for( int a = length; a > 1;a -= 2){
            if(word.substring(0, 1).equals(word.substring(a-1, a))){
                word = word.substring(1, a);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
