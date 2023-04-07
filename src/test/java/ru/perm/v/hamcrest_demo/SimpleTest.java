package ru.perm.v.hamcrest_demo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleTest {
    @Test
    public void givenString_whenEqual_thenCorrect() {
        String string = "Petya";
        assertThat(string, equalTo("Petya"));
    }
}
