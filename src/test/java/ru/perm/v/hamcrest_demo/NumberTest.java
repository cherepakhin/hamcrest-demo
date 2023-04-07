package ru.perm.v.hamcrest_demo;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

/**
 * Сравнивание чисел с заданной точностью
 */
public class NumberTest {
    @Test
    public void givenDouble_whenCompare_thenCorrect() {
        Double doubleVal = 7.70001;
        // надо убедиться, что заданное число равно 7.7 с погрешностью 0.005
        assertThat(doubleVal, closeTo(7.7, 0.005));
    }}
