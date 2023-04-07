package ru.perm.v.hamcrest_demo;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class StringTest {
    //  равна «petya», независимо от регистра?
    @Test
    public void given2Strings_whenEqual_thenCorrect() {
        String a = "Petya";
        String b = "petya";
        // HAMCREST: equalToIgnoringCase
        assertThat(a, equalToIgnoringCase(b));
    }
}
