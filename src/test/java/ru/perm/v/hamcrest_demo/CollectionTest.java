package ru.perm.v.hamcrest_demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

//TODO: Прикрутить allure?
/**
 * Проверки List
 */
public class CollectionTest {
    /**
     * Не пустой
     */
    @Test
    public void givenList_whenCheck_thenNotEmpty() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, is(not(empty())));
    }

    /**
     * Проверка размера
     */
    @Test
    public void givenList_whenCheck_thenSize3() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasSize(3));
    }

    /**
     * ВСЕ элементы  СПИСКА больше 0
     */
    @Test
    public void givenList_whenCheck_thenPosotiveElements() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, everyItem(greaterThan(0)));
    }

    /**
     * Список содержит элемент 5
     */
    @Test
    public void givenList_whenCheck_thenHasItem() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasItem(5));
    }

    /**
     * Список состоит из элементов 5, 2, 4
     */
    @Test
    public void givenList_whenCheck_thenContainsElements() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, contains(5, 2, 4));
    }
}
