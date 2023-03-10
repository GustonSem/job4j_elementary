package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
public class ConverterTest {

    @Test
    public void whenRubleConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenRubleConvert240RblThen6Dollar() {
        float in = 240;
        float expected = 4;
        float out = Converter.rubleToDollar(in);
        float eps = 0.001f;
        Assert.assertEquals(expected, out, eps);
    }
}