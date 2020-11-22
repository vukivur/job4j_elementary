package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double result = Fit.manWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenMan170Then80() {
        short in = 170;
        double expected = 80;
        double result = Fit.manWeight(in);
        Assert.assertEquals(expected, result, 0.5);
    }

    @Test
    public void whenWoman175Then75() {
        short in = 175;
        double expected = 75;
        double result = Fit.womanWeight(in);
        Assert.assertEquals(expected, result, 0.5);
    }

    @Test
    public void whenWoman187Then89() {
        short in = 187;
        double expected = 89;
        double result = Fit.womanWeight(in);
        Assert.assertEquals(expected, result, 0.5);
    }
}