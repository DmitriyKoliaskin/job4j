package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * @author Dmitriy Koliaskin (Hipf02@yandex.ru)
 * @version 0.1
 * @since 21.07.2019
 */
public class ArrayDuplicateTest {
    @Test
    /**
     * Тест.
     */
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Привет", "Мир", "Ты", "Привет", "Супер", "МалиновыйПирожок", "Мир"};
        String[] except = {"Привет", "Мир", "Ты", "Супер", "МалиновыйПирожок"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.removeDuplicatesValue(input);
        assertThat(result,  arrayContainingInAnyOrder(except));
    }
    @Test
    /**
     * Тест.
     */
    public void whenArrayHasDuplicatesThenThenDropIt() {
        String[] input = {"Kolobok", "Петросян", "Eeboy", "Eeboy", "МалиновыйПирожок", "Eeboy", "Петросян"};
        String[] except = {"Kolobok", "Петросян", "Eeboy", "МалиновыйПирожок"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.removeDuplicatesValue(input);
        assertThat(result,  arrayContainingInAnyOrder(except));
    }
}
