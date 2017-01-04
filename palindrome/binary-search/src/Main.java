
import java.io.FileNotFoundException;
/**
 * Created by melmo on 1/3/17.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Dictionary dict = new Dictionary("/usr/share/dict/web2");
        System.out.println(dict.search("zebra"));

//        List<String> words = new ArrayList<>();
//        words.add("apple");
//        words.add("banana");
//        words.add("cucumber");
//        words.add("ginger");
//        words.add("hibiscus");
//        words.add("lemon");
//        words.add("melon");
//        words.add("pepper");
//        words.add("starfruit");
//        words.add("watermelon");
//
//        Dictionary dict = new Dictionary(words);
//        System.out.println(dict.search("watermelon"));
    }


}
