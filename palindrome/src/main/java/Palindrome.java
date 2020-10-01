/**
 * Created by jeff on 1/3/17.
 */
import java.util.Scanner
public class Palindrome {
    public boolean isPalindrome(String word){
        //This will take the input from the user
        Scanner sc = new Scanner(System.in);
        //This will read the inputfrom the user and save it in variable "word"
        String word = sc.nextine();
        String reverse_word = "";
        char temporary_character;
        
        //Now we will form a reverse word by storing characters starting from the end of the original word. 
        for(int i=word.length()-1; i>=0; i--){
        temporary_character = word.charAt(i);
        reverse_word = reverse_word+temporary_character;
        reverse_word.trim();
        }
        
        //If reverse word = word, then it is a palindrome
        // .toLowerCase() is applied because it is given that cases don't matter
        if(reverse_word.toLowerCase().equals(word.toLowerCase()))
            System.out.println("The word "+word+" is a palindrome");
        else
            System.out.println("The word "+word+" is not a palindrome");
    }
}
