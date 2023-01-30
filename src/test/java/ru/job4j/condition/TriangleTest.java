package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 5;
        double ac = 5;
        double bc = 5;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 5;
        double ac = 5;
        double bc = 11;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }
}