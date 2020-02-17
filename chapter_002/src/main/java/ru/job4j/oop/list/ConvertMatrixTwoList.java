package ru.job4j.oop.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrixTwoList {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
