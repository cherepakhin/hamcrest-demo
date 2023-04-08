package ru.perm.v.hamcrest_demo;


import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;

//@Epic("static epic")
//@Feature("static feature")
//@Story("static story")
//@Owner("static owner")
//@DisplayName("Collection test")

@Epic("CollectionTest (это @Epic) Дерево смотреть в Behaviors.")
public class CollectionTest {

    List<Integer> list = Arrays.asList(5, 2, 4);

    @Test
    @Feature("Collection not empty (это @Feature)")
    @Story("Collection not empty (это @Story)")
    @DisplayName("Список не пуст (это @DisplayName)")
    @Description("Список не пуст (это @Description)")
    public void givenList_NotEmpty() {
        assertThat(list, is(not(empty())));
    }

    @Test
    @Feature("Given List have size 3 (это @Feature)")
    @Story("Collection not empty (это @Story)")
    @DisplayName("Check size (это @DisplayName)")
    @Description("Проверка размера (это @Description)")
    public void givenList_is_size_3() {
        assertThat(list, hasSize(3));
    }

    @Test
    @Feature("Given List have size 3 (это @Feature)")
    @Story("Collection not empty (это @Story)")
    @DisplayName("All items greater 0 (это @DisplayName)")
    @Description("ВСЕ элементы  СПИСКА больше 0 (это @Description)")
    public void givenList_everyItem_greaterThan0() {
        assertThat(list, everyItem(greaterThan(0)));
    }

    @Test
    @DisplayName("List 5,2,4 contains 5 (это @DisplayName , без @Feature и @Story, НО в @Epic CollectionTest")
    @Description("Список содержит элемент 5")
    public void givenList_hasItem() {
        assertThat(list, hasItem(5));
    }

//    @Test
//    @DisplayName("List 5,2,4 contains LIST elements (это @DisplayName , без @Feature и @Story)")
//    @Description("Список содержит элементЫ ДРУГОГО списка")
//    public void givenList_containsElementsOtherList() {
//        assertThat(list, contains(5, 2, 4));
//    }

    @Test
    @DisplayName("List 5,2,4 contains element. Вызывает несколько @STEP (это @DisplayName , без @Feature и @Story, НО в @Epic CollectionTest)")
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
