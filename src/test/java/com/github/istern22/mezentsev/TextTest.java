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
            "Леденящая кровь опера Джузеппе Верди «Макбет» по одноимённой трагедии \\n"
            + "Уильяма Шекспира вновь на Приморской сцене Мариинского театра. \\n"
            + "Спектакль о смерти и предательстве колдовстве и сумасшествии в атмосферной \\n"
            + "исторической постановке крупнейшего шотландского режиссёра Дэвида Маквикара.";

    @Test
    public void whenFunction1() {
        List<String> expected = new ArrayList<>(Arrays.asList("опера", "Уильяма"));
        assertThat(function1(text), is(new ArrayList<>()));
    }
}
