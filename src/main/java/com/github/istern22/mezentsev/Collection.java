package com.github.istern22.mezentsev;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

    public static void write(ArrayList<Student> students)throws IOException {
        var file = new File("C:\\Users\\Admin_10\\test2.rtf");
        file.createNewFile();
        var writer = new FileWriter(file);
        for (var student : students) {
            writer.write(student.toString() + "\n");
        }
        writer.close();
    }

    /**public static List<Student> read() throws IOException {
        var file = new File("C:\\Users\\Admin_10\\test2.txt");
        var reader = new FileReader(file);
        var scanner = new Scanner(reader);
        var result = new ArrayList<Student>();
        var result2 = "";
        while (scanner.hasNext()) {
            result2 = result2 + scanner.next();
        }
        String[] resultString = result2.split(" ");
        int[] resultInt = new int[resultString.length];
        for (int i = 0; i < resultString.length; i++) {
            resultInt[i] = Integer.parseInt(resultString[i]);
        }
        return null;
    }*/

}
