package com.github.istern22.mezentsev;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.github.istern22.mezentsev.Text.*;
import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TextTest {
    public final String text =
            "Сжалился волк. Пустил лису. Первую ночь лиса на приступочке спала. На вторую забралась в избу. А на третью на печи развалилась.";

    @Test
    public void whenFunction1() {
        List<String> expected = new ArrayList<>(Arrays.asList("лису", "Первую", "лиса", "на", "На", "вторую", "избу", "А", "на", "на", "печи"));
        assertThat(function1(text), is(expected));
    }
}
