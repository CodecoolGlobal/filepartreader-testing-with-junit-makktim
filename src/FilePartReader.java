import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;


public class FilePartReader  {


//    private String filePath = ("/home/timi/Codecool/3oop/5_si_week/filePractice/src/practice.txt");
    private String filePath;
    private Integer fromLine;
    private Integer toLine;


    public FilePartReader() {

    }


    public void setup(String filePath, Integer fromLine, Integer toLine ) throws IllegalArgumentException{
        if(toLine < fromLine || fromLine < 1){
            throw new IllegalArgumentException();
        }
        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    public String read(){
        return new String(Files.readAllBytes(paths.get(filePath)));

    }

    public String readLines() {
      String readTheLines = "";
      try{
          readTheLines = read();
      }catch (IOException e){
          e.printStackTrace();
      }
      Bufferedreader bufferedreader = new BufferedReader(new StringReader(readTheLines));
      Stream<string> printedLines = bufferedreader.lines().skip(fromLine).limit(toLine);
      return printedLines.collect(Collectors.joining("\n"));
    }
}
