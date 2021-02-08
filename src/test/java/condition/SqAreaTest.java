package condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void whenP4K1Then1() {
        int expected = 1,
                p = 4,
                k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP9K4Then3and24() {
        double expected = 3.24,
                p = 9.0,
                k = 4.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K4Then1() {
        int expected = 1,
                p = 5,
                k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}