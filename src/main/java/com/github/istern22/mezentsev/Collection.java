package com.github.istern22.mezentsev;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

    public static List<Student> read() throws IOException {
        var file = new File("C:\\Users\\Admin_10\\test2.rtf");
        var reader = new FileReader(file);
        var scanner = new Scanner(reader);
        var resultString = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            resultString.add(scanner.nextLine());
        }
        var students = new ArrayList<Student>();
        for (var string: resultString) {
            String[] data = string.split(" ");
            var resultStudent = new Student("", "", "", 0, "", new int[] {0});
            for (int i = 0; i < data.length; i++) {
                resultStudent.setName(data[0]);
                resultStudent.setSurname(data[1]);
                resultStudent.setPatronymic(data[2]);
                resultStudent.setBirthYear(Integer.parseInt(data[3]));
                resultStudent.setGender(data[4]);
                var arrayInt = "";
                for (int j = 5; j < data.length; j++) {
                    arrayInt = arrayInt + data[j];
                }
                resultStudent.setGrades(Arrays.stream(arrayInt.substring(1, arrayInt.length() - 1).split(","))
                        .mapToInt(Integer::parseInt).toArray());
            }
            students.add(resultStudent);
        }
        return students;
    }

    /**public static String olderStudent() throws IOException {
        return read().stream().min((p1, p2) -> p1.getBirthYear().compareTo(p2.getBirthYear())).ifPresent().get() ;
    }*/

}
