package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort5Numbers() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3Numbers() {
        int[] input = new int[] {3, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort7Numbers() {
        int[] input = new int[] {6, 1, 4, 5, 2, 3, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5, 6};
        assertThat(result, is(expect));
    }
}
