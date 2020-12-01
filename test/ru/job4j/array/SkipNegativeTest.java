package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SkipNegativeTest {

    @Test
    public void skipFirst() {
        int[][] array = {{1, -2}, {1, 2}};
        int[][] expect = {{1, 0}, {1, 2}};
        int[][] result = SkipNegative.skip(array);
        assertThat(result, is(expect));
    }

    @Test
    public void skipSecond() {
        int[][] array = {{2, -5}, {-3, -7}};
        int[][] expect = {{2, 0}, {0, 0}};
        int[][] result = SkipNegative.skip(array);
        assertThat(result, is(expect));
    }
}
