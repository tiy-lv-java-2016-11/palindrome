
import java.io.FileNotFoundException;
/**
 * Created by melmo on 1/3/17.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Dictionary dict = new Dictionary("/usr/share/dict/web2");
        int size = dict.getDictionary().size();
        double current = size/2;
        double min = 0;
        double max = size;
        System.out.println(dict.searchRecur("zebras", current, min, max));


//        System.out.println(dict.searchIter("zebra"));

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
//        System.out.println(dict.searchIter("watermelon"));
    }


}
