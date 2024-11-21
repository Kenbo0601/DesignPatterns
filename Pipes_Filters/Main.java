// Pipes and Filters pattern 
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String [] ignore) {

        String [] words = {"a", "ab", "abc", "abcd", "bat"};
        List<String> wordList = Arrays.asList(words);
        List<String> longWords;
        longWords = wordList.stream()
                            .filter(s->s.length()>2) // filter strings with length 2 
                            .filter(s->s.charAt(0) == 'a') // filter strings with starting index is 'a'
                            .map(s->s.toUpperCase()) // change strings to uppercase 
                            .collect(Collectors.toList()); // add them to a list 
        System.out.println(longWords);
    }
}