package array;

import org.junit.Test;
import ru.job4j.array.Machine;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    @Test
    public void whenEquals() {
        int[] expected = {};
        int[] rsl = Machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        int[] expected = {10, 5};
        int[] rsl = Machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by25() {
        int[] expected = {10, 10, 5};
        int[] rsl = Machine.change(50, 25);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by8() {
        int[] expected = {10, 10, 10, 10, 2};
        int[] rsl = Machine.change(50, 8);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when10by2() {
        int[] expected = {5, 2, 1};
        int[] rsl = Machine.change(10, 2);
        assertThat(rsl, is(expected));
    }
}