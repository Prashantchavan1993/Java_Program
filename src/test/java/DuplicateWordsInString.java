import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {



        // Hey java is java best language is java
        // java:3
        // is:2

        public static void main(String[] args) {
            findDuplicateWords("Hey java is java best language is java");
            findDuplicateWords("hi my name is somanath somanath is my name");
            findDuplicateWords("hi hi hi");
            findDuplicateWords("100 200 200 300 400 100");

        }

        public static void findDuplicateWords(String inputString) {

            // split:
            String words[] = inputString.split(" ");

            // create one hashmap
            Map<String, Integer> wordcount = new HashMap<String, Integer>();

            // to check each word in given array:
            for (String word : words) {

                // if word is present:
                if (wordcount.containsKey(word)) {
                    wordcount.put(word.toLowerCase(), wordcount.get(word) + 1);
                } else {
                    wordcount.put(word, 1);
                }
            }
            // extracting all the keys of map-wordcount
            Set<String> wordInString = wordcount.keySet();

            // loop through all the words in wordcount:
            for (String word : wordInString) {
                if (wordcount.get(word) > 1) {
                    System.out.println(word + " : " + wordcount.get(word));
                }
            }
        }

    }









