package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        boolean result = CheckPrimeNumber.check(5);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void when4() {
        boolean result = CheckPrimeNumber.check(4);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void when2() {
        boolean result = CheckPrimeNumber.check(2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void when1() {
        boolean result = CheckPrimeNumber.check(1);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void when0() {
        boolean result = CheckPrimeNumber.check(0);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void when7() {
        boolean result = CheckPrimeNumber.check(7);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void when11() {
        boolean result = CheckPrimeNumber.check(11);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void when13() {
        boolean result = CheckPrimeNumber.check(11);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void when9() {
        boolean result = CheckPrimeNumber.check(9);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}
