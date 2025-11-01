import java.util.*;

public class App {
    public static void main(String[] args) {
        Person ivan = new Person("Иван", "iivanov@ya.ru", 16);
        Person sasha = new Person(
                "Александр Евгеньевич",
                "anepretimov@diasoft.ru",
                31);

        ivan.printInfo();
    }
}
