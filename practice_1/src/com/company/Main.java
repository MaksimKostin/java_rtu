package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Map<Integer, List<String>> students = new HashMap<>(); // создали объект словаря

        List<String> studentPoint25 = new ArrayList<>(); // создали списки
        studentPoint25.add("Едапин Василий Семенович");
        studentPoint25.add("Абдула Олег Олегович");
        studentPoint25.add("Антон Антон Антонович");

        List<String> studentPoint75 = new ArrayList<>();
        studentPoint25.add("Ардаков Игорь Герасимович");
        studentPoint25.add("Донченко Иван Андреевич");
        studentPoint25.add("Кулагина Юлия Анатольевна");

        List<String> studentPoint100 = new ArrayList<>();
        studentPoint25.add("Костин Максим Романович");

        students.put(25, studentPoint25); // добавили списки
        students.put(75, studentPoint75);
        students.put(100, studentPoint100);
        // проверили списки на содержание ключа 100
        Predicate<Map<Integer, List<String>>> checkPoint100 = ourMap -> ourMap.containsKey(100);

        System.out.println(checkPoint100.test(students));
    }
}
