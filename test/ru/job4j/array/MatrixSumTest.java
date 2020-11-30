package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] array = new int[][] {{10}};
        int result = MatrixSum.sum(array);
        int expect = 10;
        assertThat(result, is(expect));
    }

    @Test
    public void whenTwo() {
        int[][] array = {{1, 2}, {1, 2}};
        int result = MatrixSum.sum(array);
        int expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void whenThree() {
        int[][] array = {{1, 2, 1}, {1, 2, 0}};
        int result = MatrixSum.sum(array);
        int expect = 7;
        assertThat(result, is(expect));
    }
}
