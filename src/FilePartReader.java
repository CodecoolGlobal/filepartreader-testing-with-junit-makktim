import java.io.File;
import java.util.Scanner;


public class FilePartReader  {


    private String filePath = ("/home/timi/Codecool/3oop/5_si_week/filePractice/src/practice.txt");


    public FilePartReader() {

    }


    public void setup(String filePath, int fromLine, int toLine ) throws IllegalArgumentException{

        try{
            File file = new File(filePath);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            if (toLine < fromLine)
                throw new IllegalArgumentException("toline smaller than fromline");
            if (fromLine < 1)
                throw new IllegalArgumentException("fromline smaller than 1");

        }
        catch (Exception scan){
            System.out.println("");
        }
    }

    public void read(){
        setup(filePath,0,100);
        Scanner scan = new Scanner(filePath);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

    }

    public void readLines() {
        setup(filePath, 0,10);
        Scanner scan = new Scanner(filePath);
        System.out.println(scan.hasNextLine());

    }
}
