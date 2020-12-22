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

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind4() {
        int[] input = new int[] {3, 2, 9, 2, 4, 8};
        int value = 9;
        int start = 2;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind0() {
        int[] input = new int[] {1, 3, 19, 42, 0, 8};
        int value = 0;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }
}