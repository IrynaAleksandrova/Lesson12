package task1;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    public static List<String> validate(List<String> allLinesFromDoc) {
        List<String> stringsValid = new ArrayList<>();
        for (String document : allLinesFromDoc) {
            if (document.matches("[docnum]*[A-Za-z\\d]{9}") || document.matches("[contract]*[A-Za-z\\d]{7}")) {
                stringsValid.add(document);
            }
        }
        return stringsValid;
    }
}
