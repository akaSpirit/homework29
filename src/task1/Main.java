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
        cats.sort((c1, c2) -> c1.getBreed().toString().compareTo(c2.getBreed().toString()));
//        cats.sort(Cat::byBreed);                          //тоже самое ссылкой на метод
        Printer.print(cats);


        System.out.println("Sort list by name and age");
        cats.sort((с1, с2) -> {
            if (с1.getName().equals(с2.getName()))
                return с1.getAge() - с2.getAge();
            return с1.getName().compareTo(с2.getName());
        });
//        cats.sort(Cat::byName);                           //тоже самое ссылкой на метод
//        cats.sort(Comparator.comparingInt(Cat::getAge));  //раскомментировать, если сортировка по возрасту приоритетнее сортировки по имени.
        Printer.print(cats);


        System.out.println("Remove from list if color is tortie");
        cats.removeIf(cat -> cat.getColor().equals(Cat.Color.TORTIE));
//        cats.removeIf(Cat::removeIfColorTortie);          //тоже самое ссылкой на метод
        Printer.print(cats);


        System.out.println("Remove from list if name length is 5");
        cats.removeIf(cat -> cat.getName().length() == 5);
//        cats.removeIf(Cat::removeIfNameLengthFive);       //тоже самое ссылкой на метод
        Printer.print(cats);
    }


}
