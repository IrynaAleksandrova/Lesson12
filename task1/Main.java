package task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
//    Допустим есть txt файл с номерами документов.
//    Номером документа является строка, состоящая из букв и цифр (без служебных символов).
//    Пусть этот файл содержит каждый номер документа с новой строки и в
//    строке никакой другой информации, только номер документа.
//    Валидный номер документа должен иметь длину 15 символов и
//    начинаться с последовательности docnum или contract (далее любая последовательность букв/цифр).
//    Написать программу для чтения информации из входного файла - путь к
//    входному файлу должен задаваться через консоль.

    public static void main(String[] args) throws IOException {
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Enter path of file: ");         //   task1/numbers.txt
            List<String> listOfDocuments = Files.readAllLines(Path.of(console.nextLine()));

            List<String> validatedList = Validator.validate(listOfDocuments);
            System.out.println(validatedList);
        }
    }
}