package pl.softie.course4.fileoperations;

import pl.softie.course4.fileoperations.model.UserData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileExample {

    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("src/pl/softie/course4/fileoperations/input.json"));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            // read next line
            line = reader.readLine();
        }
        reader.close();
    }

}
