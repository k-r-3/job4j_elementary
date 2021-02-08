package condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenBothThen1() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1And2To3Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax5And2To3Then5() {
        int result = Max.max(5, 2, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5And2And3To1Then5() {
        int result = Max.max(5, 2, 3, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax12And22And100To5Then100() {
        int result = Max.max(12, 22, 100, 5);
        assertThat(result, is(100));
    }
}