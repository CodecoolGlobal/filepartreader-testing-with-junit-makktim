import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FilePartReader  {


    //    private String filePath = ("/home/timi/Codecool/3oop/5_si_week/filePractice/src/practice.txt");
    private String filePath;
    private Integer fromLine;
    private Integer toLine;


    public FilePartReader() {
//        this.filePath = "";

    }


    public void setup(String filePath, Integer fromLine, Integer toLine ) throws IllegalArgumentException{

        if(toLine < fromLine || fromLine < 1){
            throw new IllegalArgumentException();
        }

        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    public String read() throws IOException {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(filePath)));
        return data;

    }

    public String readLines() {
        String readTheLines="";

        try {
            readTheLines = read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(new StringReader(readTheLines));
        Stream<String> printedLines = bufferedReader.lines().skip(fromLine-1).limit(toLine-1);

        return printedLines.collect(Collectors.joining("\n"));
    }
}
