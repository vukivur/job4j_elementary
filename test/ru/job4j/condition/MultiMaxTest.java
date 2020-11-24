package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int max = MultiMax.max(1, 4, 2);
        assertThat(max, is(4));
    }

    @Test
    public void whenFirstMax() {
        int max = MultiMax.max(7, 5, 3);
        assertThat(max, is(7));
    }

    @Test
    public void whenThirdMax() {
        int max = MultiMax.max(6, 4, 8);
        assertThat(max, is(8));
    }

    @Test
    public void whenAllNumbersAreSame() {
        int max = MultiMax.max(2, 2, 2);
        assertThat(max, is(2));
    }
}