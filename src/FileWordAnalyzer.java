import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWordAnalyzer {

    private final FilePartReader filePartReader;

    public FileWordAnalyzer(FilePartReader filePartReader) {
        this.filePartReader = filePartReader;
    }

    public List getWordsOrderedAlphabetically (){
        String readLines = filePartReader.readLines().replaceAll("\n", " ");
        String[] words = readLines.split(" ");
        Arrays.sort(words);

        return Arrays.asList(words);
    }

    public List getWordsContainingSubstring (String subString) {
        String text = filePartReader.readLines();
        String lines[] = text.split("\n");
        List<String> words = new ArrayList<>();

        for (int i = 0; i < lines.length; i++) {
            String[] strings = lines[i].split(" ");
            for (String word : strings) {
                if (!word.equals(" ") && !word.isEmpty()) {
                    if (word.contains(subString)) {
                        words.add(word);
                    }
                }
            }
        }
        return words;
    }

    public List getStringsWhichPalindrome() {
        String lineBreaks = filePartReader.readLines().replaceAll("\n", " ");
        String[] palindromeWords = lineBreaks.split(" ");

        StringBuilder result = new StringBuilder();
        StringBuilder wordsReverse = new StringBuilder();


        for (String word : palindromeWords) {
            wordsReverse.append(word).reverse();
            if (wordsReverse.toString().equals(word)) {
                result.append(word + " ");
            }
            wordsReverse.delete(0, wordsReverse.length());
        }

        if (result.toString().length() == 0) {
            return null;
        } else {
            return Arrays.asList(result.toString().split(" "));
        }
    }
}