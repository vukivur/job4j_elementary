package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenFridayIs5() {
        int result = MultipleSwitchWeek.numberOfDay("Friday");
        assertThat(result, is(5));
    }

    @Test
    public void whenSundayIs7() {
        int result = MultipleSwitchWeek.numberOfDay("Воскресенье");
        assertThat(result, is(7));
    }

    @Test
    public void whenThursdayIs4() {
        int result = MultipleSwitchWeek.numberOfDay("Thursday");
        assertThat(result, is(4));
    }

    @Test
    public void whenWednesdayIs3() {
        int result = MultipleSwitchWeek.numberOfDay("Wednesday");
        assertThat(result, is(3));
    }

    @Test
    public void whenAnotherIsMinus1() {
        int result = MultipleSwitchWeek.numberOfDay("Another");
        assertThat(result, is(-1));
    }
}