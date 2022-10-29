package task2;

public class Main {
//    Дополнить task1. Валидные номера документов следует записать в один файл-отчет.
//    Невалидные номера документов следует записать в другой файл-отчет,
//    но после номеров документов следует добавить информацию о том, почему этот документ невалиден.

    public static void main(String[] args) {
        Sorting documentSorting = new Sorting();
        documentSorting.sort();
    }
}
