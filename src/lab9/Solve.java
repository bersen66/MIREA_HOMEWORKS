package lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solve {
    public static void main(String[] args) {

        String mercury = new String("Mercury");
        String venus = new String("Venus");
        String earth = new String("Earth");
        String mars = new String("Mars");
        String pluto = new String("Pluto");
        String neptun = new String("Neptun");

        // Создание первого списка
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(mercury, venus, pluto, neptun));

        // Создание второго листа, сделан неизменяемым
        List<String> list2 =  Collections.unmodifiableList(
                new ArrayList<String>(
                        Arrays.asList(mars, mercury, earth)
                )
        );

        list1.add(earth);                 // Добавление элемента
        System.out.println(list1);
        list1.remove(0);            // Удаление элемента
        System.out.println(list1);
        list1.set(0, mars);              // Изменение
        System.out.println(list1);
        Collections.shuffle(list1);      // Перемешивание
        System.out.println(list1.indexOf(neptun)); // Получение индекса

        System.out.println(list1.contains(venus));
        System.out.println(list1.contains(pluto));

        // метод из документации
        System.out.println(list1.subList(0, list1.size() / 2)); // Выделение подмассива по двум индексам
    }
}
