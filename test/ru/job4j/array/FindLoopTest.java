package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas4Then2() {
        int[] input = {0, 3, 4, 7, 21};
        int expectedPosition = 2;
        int value = 4;
        int result = FindLoop.indexOf(input, value);
        assertThat(result, is(expectedPosition));
    }

    @Test
    public void whenArrayHas1Then5() {
        int[] input = {0, 3, 4, 7, 21, 11};
        int expectedPosition = 5;
        int value = 1;
        int result = FindLoop.indexOf(input, value);
        assertThat(result, is(expectedPosition));
    }
}