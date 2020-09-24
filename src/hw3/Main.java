package hw3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader fileReader = new FileReader("test.txt");
        BufferedReader bufReader = new BufferedReader(fileReader);
        String data = null;
        while((data = bufReader.readLine()) != null) {
            System.out.println((data));
        }
        bufReader.close();
    }
}
