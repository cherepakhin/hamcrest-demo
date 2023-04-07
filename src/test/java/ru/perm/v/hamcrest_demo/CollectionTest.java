package ru.perm.v.hamcrest_demo;


import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;

@DisplayName("Collection test")
public class CollectionTest {

    List<Integer> list = Arrays.asList(5, 2, 4);

    @Test
    @DisplayName("Collection not empty")
    @Description("Список не пуст")
    public void givenList_NotEmpty() {
        assertThat(list, is(not(empty())));
    }

    @Test
    @DisplayName("Check size")
    @Description("Проверка размера")
    public void givenList_is_size_3() {
        assertThat(list, hasSize(3));
    }

    @Test
    @DisplayName("All items greater 0")
    @Description("ВСЕ элементы  СПИСКА больше 0")
    public void givenList_everyItem_greaterThan0() {
        assertThat(list, everyItem(greaterThan(0)));
    }

    @Test
    @DisplayName("List 5,2,4 contains 5")
    @Description("Список содержит элемент 5")
    public void givenList_hasItem() {
        assertThat(list, hasItem(5));
    }

    @Test
    @DisplayName("List 5,2,4 contains LIST elements")
    @Description("Список содержит элементЫ ДРУГОГО списка")
    public void givenList_containsElementsOtherList() {
        assertThat(list, contains(5, 2, 4));
    }

    @Test
    @DisplayName("List 5,2,4 contains element. USED STEP")
    @Description("Список содержит элемент")
    public void givenList_containsElements() {
        checkInList(5);
        checkInList(2);
        checkInList(4);
    }

    @Step("Проверка разности числа {num}")
    public void checkInList(Integer num) {
        assertTrue("Список (5,2,4) содержит", list.contains(num));
    }
}
