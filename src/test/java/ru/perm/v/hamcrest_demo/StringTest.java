package ru.perm.v.hamcrest_demo;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;

public class StringTest {
    //  равна «petya», независимо от регистра?
    @Test
    public void given2Strings_whenEqual_thenCorrect() {
        String a = "Petya";
        String b = "petya";
        // HAMCREST: equalToIgnoringCase
        assertThat(a, equalToIgnoringCase(b));
    }

    @Test
    public void given2Strings_whenEqualIgnWhateSpace_thenCorrect() {
        String a = "  Hi   Petya ";
        // HAMCREST: equalToIgnoringWhiteSpace
        assertThat(a, equalToIgnoringWhiteSpace("Hi Petya"));
    }
}
