package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenHasNotMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        boolean expect = false;
        assertThat(result, is(expect));
    }

    @Test
    public void whenHasMonoHorizontalSecond() {
        char[][] input = {
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 2);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenHasNotMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 1);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
