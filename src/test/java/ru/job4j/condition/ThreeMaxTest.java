package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ThreeMaxTest {
    @Test
    public void firstMax() {
        int first = 10;
        int second = 5;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void secondMax() {
        int first = 10;
        int second = 50;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void thirdMax() {
        int first = 1;
        int second = 5;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }
}