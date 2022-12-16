package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> source = new ArrayList<>();
        Random random = new Random();

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int arrSize = scan.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxVal = scan.nextInt();

        logger.log("Создаём и наполняем список");
        int randomInt;
        StringBuilder sArr = new StringBuilder();
        for (int i = 0; i < arrSize; i++) {
            randomInt = random.nextInt(maxVal);
            source.add(randomInt);
            sArr = sArr.append(randomInt).append(" ");
        }
        System.out.println("Вот случайный список: " + sArr.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int thrashold = scan.nextInt();

        Filter filter = new Filter(thrashold);
        List<Integer> result = filter.filterOut(source);

        int size = result.size();
        StringBuilder s = new StringBuilder("Прошло фильтр элементов: ")
                .append(size).append(" из ").append(arrSize);
        logger.log(s.toString());

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        StringBuilder sval = new StringBuilder();
        for (Integer val : result) {
            sval.append(val).append(" ");
        }
        System.out.println(sval.toString());

        logger.log("Завершаем программу");
    }
}