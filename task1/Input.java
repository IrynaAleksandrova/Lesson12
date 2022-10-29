package task1;

import java.util.Scanner;

public class Input {

    public static String input() {
        Scanner consol = new Scanner(System.in);
        System.out.println("Enter path of file: ");   //        D:\TeachMeSkills\Projects\Lesson12\src\task1\numbers.txt
        return consol.nextLine();
    }

    public static String getInput() {
        return input();
    }
}
