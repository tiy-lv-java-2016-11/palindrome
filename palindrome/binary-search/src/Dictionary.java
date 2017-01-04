import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by melmo on 1/3/17.
 */
public class Dictionary {
    private List<String> dictionary = new ArrayList<>();


    public boolean searchRecur(String word, double current, double min, double max){
        String currentWord = this.dictionary.get((int)current);

        if (max-min > 1){
            if (currentWord.equalsIgnoreCase(word)){
                return true;
            }
            else if (currentWord.compareToIgnoreCase(word) < 0) {
                min = current;
                current = (Math.ceil(max - current) / 2) + current;
            }
            else if (currentWord.compareToIgnoreCase(word) > 0) {
                max = current;
                current = ((current - min)/ 2) + min;
            }
            return searchRecur(word, current, min, max);
        }
        return false;


    }

//    public boolean searchIter(String word){
//        int size = this.dictionary.size()-1;
//        double currIndex = size/2;
//        double minIndex = 0;
//        double maxIndex = size;
//        String currentWord = this.dictionary.get((int)currIndex);
//
//        while (maxIndex-minIndex > 1) {
//            if (currentWord.equalsIgnoreCase(word)) {
//                return true;
//            }
//            else if (currentWord.compareToIgnoreCase(word) < 0) {
//                minIndex = currIndex;
//                currIndex = (Math.ceil(maxIndex - currIndex) / 2) + currIndex;
//            }
//            else if (currentWord.compareToIgnoreCase(word) > 0) {
//                maxIndex = currIndex;
//                currIndex = ((currIndex - minIndex)/ 2) + minIndex;
//            }
//            currentWord = this.dictionary.get((int)currIndex);
//        }
//        return false;
//    }


    public Dictionary(List<String> wordList){
        this.dictionary = wordList;
    }

    public Dictionary(String filepath) throws FileNotFoundException {
        File f = new File(filepath);
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()){
            String word = scanner.nextLine();
//            System.out.println(word);
            this.dictionary.add(word);
        }
    }

    public List<String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(List<String> dictionary) {
        this.dictionary = dictionary;
    }
}
