package array;

import org.junit.Test;
import ru.job4j.array.SwitchArray;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2to5() {
        int[] input = {1, 2, 3, 4, 3, 6};
        int[] expect = {1, 2, 6, 4, 3, 3};
        int[] rsl = SwitchArray.swap(input, 2, 5);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to3() {
        int[] input = {1, 21, 2, 1, 3};
        int[] expect = {1, 1, 2, 21, 3};
        int[] rsl = SwitchArray.swap(input, 1, 3);
        assertThat(rsl, is(expect));
    }
}