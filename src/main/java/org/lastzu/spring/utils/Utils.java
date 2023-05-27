package org.lastzu.spring.utils;

import java.util.List;
import java.util.Random;

public class Utils {
    public static <T> T randomElement(List<T> list) {
        Random rnd = new Random();
        int position = Math.abs(rnd.nextInt(list.size()));
        return list.get(position);
    }
}
