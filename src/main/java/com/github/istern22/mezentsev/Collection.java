package com.github.istern22.mezentsev;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Collection {

    /**
     * Информация о группе студентов хранится в файдле прямого доступа.
     * Структура записи имеет следующий вид:
     * 1. Фамилия
     * 2. Имя
     * 3. Отчество
     * 4. Год рождения
     * 5. Пол
     * 6. Массив оценок(не менее трех предметов)
     * В группе не менее 10 человек (5 юношей и 5 девушек).
     * Программа должна допускать следующие режимы работы:
     * 1. Добавить запись в файл(если файла нет, то создать его)
     * 2. Посмотреть все записи файла
     * 3. Вывести результаты запроса
     */

   /** public static List<Student> read() throws IOException {
        File file = new File("C:\\Users\\Admin_10\\test2.txt");
        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);
        String result = "";
        while (scanner.hasNext()) {
            result = result + scanner.next() + " ";
        }
        String[] resultString = result.split(" ");
        int[] resultInt = new int[resultString.length];
        for (int i = 0; i < resultString.length; i++) {
            resultInt[i] = Integer.parseInt(resultString[i]);
        }
        return null;
    }*/

}
