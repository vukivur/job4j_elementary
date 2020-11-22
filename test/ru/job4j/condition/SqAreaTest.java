package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void squareWhenP6K2Then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void squareWhenP4K1Then1() {
        int expected = 1;
        int p = 4;
        int k = 1;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01);
    }
}