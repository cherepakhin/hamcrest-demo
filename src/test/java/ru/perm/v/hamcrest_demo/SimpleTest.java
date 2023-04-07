package ru.perm.v.hamcrest_demo;

import org.junit.Test;

// В Hamcrest предикат только один - assertThat
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class SimpleTest {
    @Test
    public void givenString_whenEqual_thenCorrect() {
        String string = "NAME";
        // В Hamcrest вся функциональность переложена на matcher-ы,
        // такие как equalTo(), not(), anyOf(), is(). Их много.
        // Предикат только один - assertThat
        assertThat(string, equalTo("NAME"));
    }

    @Test
    public void givenString_whenConditions_thenCorrect() {
        String string = "Petya";
        // Логические matchers:
        //  allOf() — И
        //  anyOf() — ИЛИ
        //  not() — НЕ

        // containsString, endsWith - hamcrest
        assertThat(string, anyOf(containsString("Pet"), endsWith("tya")));
    }

    @Test
    public void givenNumber_whenConditions_thenCorrect() {
        Integer intVal = 7;
//        greaterThan(), lessThanOrEqualTo(), equalTo() сравнивают ОБЪЕКТЫ, а не числа.
//        Числа тут всего лишь частный случай.
        assertThat(intVal,
                allOf(
                        greaterThan(5),
                        lessThanOrEqualTo(7),
                        not(equalTo(6))
                )
        );
    }

    @Test
    public void test_is() {
        Integer intVal = 7;
//        существует декоратор is(), он ничего не добавляет, кроме читабельности
        assertThat(intVal, is(equalTo(7)));
    }
}
