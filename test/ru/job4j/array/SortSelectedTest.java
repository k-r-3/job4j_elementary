package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.SortSelected;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void when5Sort() {
        int[] input = {2, 8, 4, 10, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = {0, 2, 4, 8, 10};
        assertThat(result, is(expect));

    }

    @Test
    public void when3Sort() {
        int[] input = {123, 345, 99};
        int[] result = SortSelected.sort(input);
        int[] expect = {99, 123, 345};
        assertThat(result, is(expect));

    }
}