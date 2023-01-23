package ru.job4j;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan178Then89() {
        short in = 178;
        double expected = 89.69;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman168Then66() {
        short in = 168;
        double expected = 66.69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}