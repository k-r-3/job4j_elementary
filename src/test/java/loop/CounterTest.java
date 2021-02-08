package loop;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromFiveToFifteenThenFifty() {
        int rsl = Counter.sumByEven(5, 15);
        int expected = 50;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromNineToTwentySevenThenFifty() {
        int rsl = Counter.sumByEven(9, 27);
        int expected = 162;
        assertThat(rsl, is(expected));
    }
}