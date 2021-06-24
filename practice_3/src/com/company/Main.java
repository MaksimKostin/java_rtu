package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Set<Integer> synchronizedSet = new SynchronizedSet<>();// создали потокобезопасный HashSet
        Map<Integer, String> synchronizedMap = new SemaphoreMap<>(1);// создали потокобезопасный HashMap

        Thread firstThread = new Thread(() -> { // создали первый поток
            synchronizedSet.add(2); // добавили в Set
            synchronizedSet.add(4);
            synchronizedSet.add(6);
            synchronizedSet.add(8);
            synchronizedMap.put(1, "Nice"); // добавили в Map
            synchronizedMap.put(2, "Like");
        });

        Thread secondThread = new Thread(() -> { // создали второй поток
            synchronizedSet.add(3);
            synchronizedSet.add(5);
            synchronizedSet.add(7);
            synchronizedMap.put(3, "Good");
            synchronizedMap.put(4, "Let");
        });

        firstThread.start(); // запуск потоков
        secondThread.start();

        Thread.sleep(3000); // задержка потока main на 3 сек

        printValues(synchronizedMap); // вызов собственного метода printValues
        System.out.println("\n");
        System.out.println(Arrays.toString(synchronizedSet.toArray())); // вывод конечного Set
    }

    public static void printValues(Map<Integer, String> map) // создали метод для вывода Map
    {
        for(Map.Entry<Integer, String> pair : map.entrySet()) // передали по паре и вывели
        {
            Integer key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
