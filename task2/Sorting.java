package task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Sorting {
    public void sort() {
        try (BufferedWriter writerValid = new BufferedWriter(new FileWriter("src/task2/ValidDocs.txt"));
             BufferedWriter writerInvalid = new BufferedWriter(new FileWriter("src/task2/InvalidDocs.txt"))) {

            List<String> listOfDocuments = Files.readAllLines(Path.of("src/task2/differentDocs.txt"));

            for (String document : listOfDocuments) {
                if (document.matches("[A-Za-z\\d]+") && document.length() == 15 &&
                        (document.startsWith("docnum") || document.startsWith("contract"))) {
                    writerValid.write(document + "\n");
                } else if (!(document.startsWith("docnum") || document.startsWith("contract"))) {
                    writerInvalid.write(document + " - invalid document start name\n");
                } else if (!document.matches("[A-Za-z\\d]+")) {
                    writerInvalid.write(document + " - invalid document, because it contains more than just letters and numbers\n");
                } else if (document.length() != 15) {
                    writerInvalid.write(document + " - invalid document, because length does not contain 15 characters\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
