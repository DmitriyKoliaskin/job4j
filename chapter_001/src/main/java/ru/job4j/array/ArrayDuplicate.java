package ru.job4j.array;

        import java.util.Arrays;

/**
 * @author Dmitriy Koliaskin (Hipf02@yandex.ru)
 * @version 0.1
 * @since 21.07.2019
 */
public class ArrayDuplicate {
    /**
     * Массив возвращает уникальные значения.
     * @param array массив.
     * @return возвращение уникальных значений.
     */
    public String[] removeDuplicatesValue(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}