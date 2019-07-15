public class FilePartReader {

    public FilePartReader(){

    }

    public void setup(String filePath, int fromLine, int toLine ) throws IllegalArgumentException{

        if (toLine < fromLine)
            throw new IllegalArgumentException("toline smaller than fromline");
        if (fromLine < 1)
            throw new IllegalArgumentException("fromline smaller than 1");
    }

    public String read(){
        return null;
    }

    public String readLines(){
        return null;
    }
}