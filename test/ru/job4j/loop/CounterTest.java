package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumWhen0to0is0() {
        int result = Counter.sum(0, 0);
        assertThat(result, is(0));
    }

    @Test
    public void sumWhen1to3is6() {
        int result = Counter.sum(1, 3);
        assertThat(result, is(6));
    }

    @Test
    public void sumWhen1to0is0() {
        int result = Counter.sum(1, 0);
        assertThat(result, is(0));
    }

    @Test
    public void sumWhen5to6is11() {
        int result = Counter.sum(5, 6);
        assertThat(result, is(11));
    }

    @Test
    public void sumWhen0toMinus5is0() {
        int result = Counter.sum(0, -5);
        assertThat(result, is(0));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int result = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromFiveToOneThenZero() {
        int result = Counter.sumByEven(5, 1);
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromZeroToZeroThenZero() {
        int result = Counter.sumByEven(0, 0);
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromFourToFourThenFour() {
        int result = Counter.sumByEven(4, 4);
        int expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromFiveToFiveThenZero() {
        int result = Counter.sumByEven(5, 5);
        int expected = 0;
        assertThat(result, is(expected));
    }
}