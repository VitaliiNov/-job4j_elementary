package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To5Then7() {
        int left = 7;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To6Then6() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To6TO7Then7() {
        double left = 6;
        double right = 6;
        double forward = 7;
        double result = Max.max(left, right, forward);
        double expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To6TO8Then8() {
        int left = 6;
        int right = 6;
        int forward = 8;
        int result = Max.max(left, right, forward);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To6To6To9Then9() {
        int black = 2;
        int left = 6;
        int right = 6;
        int forward = 9;
        int result = Max.max(black, left, right, forward);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To10To6To9Then10() {
        byte black = 1;
        byte left = 10;
        byte right = 6;
        byte forward = 9;
        byte result = (byte) Max.max(left, right, forward, black);
        byte expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}