public class main {

    public static void main(String[] arg){
        FilePartReader filePartReader = new FilePartReader();

        filePartReader.setup("/home/timi/Codecool/3oop/5_si_week/filePractice/src/practice.txt", 1, 5);
        System.out.println(filePartReader.readLines());
    }
}