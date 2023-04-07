package ru.perm.v.hamcrest_demo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;

public class ObjectTest {
    @Test
    public void whenNotNull_thenCorrect() {
        String str = new String();
        // Вместо самописныйх проверок на null, используется notNullValue()
        assertThat(str, notNullValue());
    }

    @Test
    public void whenSameObject_thenCorrect() {

        Object object = new String();
        // Это тот же самый экземпляр, что и в аргументе матчера?
        assertThat(object, sameInstance(object));
    }
}
