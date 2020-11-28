package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenBound4Then0149() {
        int bound = 4;
        int[] result = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9};
        //assertThat(result, is(expect));
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9, 16};
        assertThat(result, is(expect));
    }
}
