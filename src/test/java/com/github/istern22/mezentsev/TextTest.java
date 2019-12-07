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
    public final String text1 =
            "Сжалился длинный волк в зоопарке. Пустил деревянную лису. Первую ночь лиса на приступочке спала. На вторую забралась в избу. А на третью в воображении на топленной печи развалилась.";

    @Test
    public void whenFunction1() {
        List<String> expected = new ArrayList<>(Arrays.asList("лису", "Первую", "лиса", "на", "На", "вторую", "избу", "А", "на", "на", "печи"));
        assertThat(function1(text), is(expected));
    }

    @Test
    public void whenFunction2() {
        List<String> expected = new ArrayList<>(Arrays.asList("Сжалился", "волк", "Пустил", "ночь", "приступочке", "спала", "забралась", "в", "третью", "развалилась"));
        assertThat(function2(text), is(expected));
    }

    @Test
    public void whenFunction3() {
        List<String> expected = new ArrayList<>(Arrays.asList("Сжалился волк.", "Пустил лису.", "Первую ночь лиса на приступочке спала.", "А на третью на печи развалилась."));
        assertThat(function3(text), is(expected));
    }

    @Test
    public void whenFunction4() {
        List<String> expected = new ArrayList<>(Arrays.asList("На вторую забралась в избу."));
        assertThat(function4(text), is(expected));
    }

    @Test
    public void whenFunction5() {
        List<String> expected = new ArrayList<>(Arrays.asList("зоопарке", "воображении"));
        assertThat(function5(text1), is(expected));
    }

    @Test
    public void whenFunction6() {
        List<String> expected = new ArrayList<>(Arrays.asList("волк", "лису", "на", "в", "А"));
        assertThat(function6(text), is(expected));
    }

    @Test
    public void whenFunction7() {
        List<String> expected = new ArrayList<>(Arrays.asList("Сжалился", "Пустил", "приступочке", "забралась", "развалилась"));
        assertThat(function7(text), is(expected));
    }

    @Test
    public void whenFunction8() {
        List<String> expected = new ArrayList<>(Arrays.asList("длинный", "деревянную", "топленной"));
        assertThat(function8(text1), is(expected));
    }

    @Test
    public void whenFunction9() {
        List<String> expected = new ArrayList<>(Arrays.asList("Сжалился", "приступочке", "забралась", "развалилась"));
        assertThat(function9(text, 6), is(expected));
    }

    @Test
    public void whenFunction10() {
        List<String> expected = new ArrayList<>(Arrays.asList("на", "На", "в", "А", "на", "на"));
        assertThat(function10(text, 3), is(expected));
    }

    @Test
    public void whenFunction11() {
        List<String> expected = new ArrayList<>(Arrays.asList("Первую", "вторую"));
        assertThat(function11(text, "ую"), is(expected));
    }
}
