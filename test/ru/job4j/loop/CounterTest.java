package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void when0to0is0() {
        int result = Counter.sum(0, 0);
        assertThat(result, is(0));
    }

    @Test
    public void when1to3is6() {
        int result = Counter.sum(1, 3);
        assertThat(result, is(6));
    }

    @Test
    public void when1to0is0() {
        int result = Counter.sum(1, 0);
        assertThat(result, is(0));
    }

    @Test
    public void when5to6is11() {
        int result = Counter.sum(5, 6);
        assertThat(result, is(11));
    }

    @Test
    public void when0toMinus5is0() {
        int result = Counter.sum(0, -5);
        assertThat(result, is(0));
    }
}