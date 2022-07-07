package task1;

import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);
        System.out.println("Sort list by breed");
        cats.sort(Cat::byBreed);
        Printer.print(cats);

        System.out.println("Sort list by name and age");
        cats.sort(Cat::byName);
        cats.sort(Comparator.comparingInt(Cat::getAge));
        Printer.print(cats);

        System.out.println("Remove from list if color is tortie");
        cats.removeIf(Cat::removeIfTortieColor);
        Printer.print(cats);

        System.out.println("Remove from list if name length is 5");
        cats.removeIf(Cat::removeIfNameLengthFive);
        Printer.print(cats);
    }


}
