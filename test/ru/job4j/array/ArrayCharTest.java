package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'e', 'l', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
