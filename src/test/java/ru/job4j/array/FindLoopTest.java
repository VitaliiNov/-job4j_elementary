package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {25, 114, 3, 35, 684, 8, 26, 951, 291, 45, 37};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas21Then6() {
        int[] data = new int[] {5, 10, 3, 8, 165, 317, 21};
        int el = 21;
        int result = FindLoop.indexOf(data, el);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}