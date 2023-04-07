package ru.perm.v.hamcrest_demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;

public class CollectionTest {
    @Test
    public void givenList_whenCheck_thenNotEmpty() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, is(not(empty())));

    }}
