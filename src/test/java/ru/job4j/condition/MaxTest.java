package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class MaxTest {

    @Test
    public void when45To77Then77() {
        int left = 45;
        int right = 77;
        int expected = 77;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when65To77Then31() {
        int left = 65;
        int right = 31;
        int expected = 65;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when234To77Then234() {
        int left = 234;
        int right = 234;
        int expected = 234;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }
}