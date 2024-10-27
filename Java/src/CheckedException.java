import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try {
            readFile("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }


    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
    }
}

