import service.Deserialization;
import service.ReadFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestFile {
    public static void main(String[] args) throws Exception {
        //maven project
        //citire din fisier text
        // String path = "C:\\Users\\Olimpia\\IdeaProjects\\Files\\src\\main\\resources\\my_text.txt";

        //pasare prin valoare
        String mypath = "C:\\Users\\Olimpia\\IdeaProjects\\Files\\src\\main\\resources\\my_text.txt";

        //pasare prin referinta
        // ReadFile.readFromFile(path);

        List<String> linesFromFile = ReadFile.readFromFile(mypath);

       /* for (int i = 0; i < linesFromFile.size(); i++) {

            System.out.println(linesFromFile.get(i));
        }

        for (String element : linesFromFile
        ) {
            System.out.println(element);

        }*/

        Deserialization deserialization = new Deserialization();
        for (String line :
                linesFromFile) {
            try {
                System.out.println(deserialization.deserialize(line));
            } catch (Exception ex) {
                System.out.println("Wrong text: " + line);
            }

        }

    }
}
