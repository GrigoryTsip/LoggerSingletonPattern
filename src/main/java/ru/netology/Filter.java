package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {

        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтр");
        for (Integer val : source) {
            if (val <= threshold) {
                logger.log("Элемент \"" + val + "\" не подходит");
            } else {
                result.add(val);
                logger.log("Элемент \"" + val + "\" проходит");
            }
        }
        return result;
    }
}
