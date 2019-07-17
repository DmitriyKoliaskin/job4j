package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[]{4, 1, 6, 2, 0, 3, 5, 7, 9, 8};
        int[] result = bubbleSort.bubble(input);
        int[] expect = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }
}
