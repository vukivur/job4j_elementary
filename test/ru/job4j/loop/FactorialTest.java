package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int result = Factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenZero() {
        int result = Factorial.calc(0);
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int result = Factorial.calc(1);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForMinusOneThenZero() {
        int result = Factorial.calc(-1);
        int expected = 0;
        assertThat(result, is(expected));
    }
}