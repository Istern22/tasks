package com.github.istern22.mezentsev;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        var file = new File("C:\\Users\\Istern22\\test2.rtf");
        file.createNewFile();
        var writer = new FileWriter(file);
        for (var student : students) {
            writer.write(student.toString() + "\n");
        }
        writer.close();
    }

    public static List<Student> read() throws IOException {
        var file = new File("C:\\Users\\Istern22\\test2.rtf");
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

    /**
     * Вывести информацию о самом старшем студнете.
     * @return
     * @throws IOException
     */
    public static List<Student> olderStudentMan() throws IOException {
        List<Student> students = read();
        int oldestBirthYear = students
                .stream()
                .filter(student -> student.getGender().equals("man"))
                .min(Comparator.comparing(Student::getBirthYear))
                .get()
                .getBirthYear();
        return students
                .stream()
                .filter((student) -> student.getBirthYear() == oldestBirthYear && student.getGender().equals("man"))
                .collect(Collectors.toList());
    }

    /**
     * Вывести информацию о самом молодом студнете.
     * @return
     * @throws IOException
     */
    public static List<Student> youngerStudentMan() throws IOException {
        int youngestBirthYear = read()
                .stream()
                .filter(student -> student.getGender().equals("man"))
                .max(Comparator.comparing(Student::getBirthYear))
                .get()
                .getBirthYear();
        return read()
                .stream()
                .filter((student) -> student.getBirthYear() == youngestBirthYear && student.getGender().equals("man"))
                .collect(Collectors.toList());
    }

    /**
     * Вывести информацию о самой старшей студентке.
     * @return
     * @throws IOException
     */
    public static List<Student> olderStudentWoman() throws IOException {
        int oldestBirthYear = read()
                .stream()
                .filter(student -> student.getGender().equals("woman"))
                .min(Comparator.comparing(Student::getBirthYear))
                .get()
                .getBirthYear();
        return read()
                .stream()
                .filter((student) -> student.getBirthYear() == oldestBirthYear && student.getGender().equals("woman"))
                .collect(Collectors.toList());
    }

    /**
     * Вывести информацию о самой молодой студентке.
     * @return
     * @throws IOException
     */
    public static List<Student> youngerStudentWoman() throws IOException {
        int youngestBirthYear = read()
                .stream()
                .filter(student -> student.getGender().equals("woman"))
                .max(Comparator.comparing(Student::getBirthYear))
                .get()
                .getBirthYear();
        return read()
                .stream()
                .filter((student) -> student.getBirthYear() == youngestBirthYear && student.getGender().equals("woman"))
                .collect(Collectors.toList());
    }

    /**
     * Вывести информацию о самом успевающем студенте
     * @return
     * @throws IOException
     */
    public static Student mostSuccessfulStudentMan() throws IOException {
        Map<Student, OptionalDouble> average = read()
                .stream()
                .filter(student -> student.getGender().equals("man"))
                .collect(Collectors.toMap(student -> student, student -> Arrays.stream(student.getGrades()).average()));
        Student student = average.keySet().stream().max(
                Comparator.comparingDouble(s -> average.getOrDefault(s, OptionalDouble.of(0.0)).getAsDouble())
                ).get();

        return student;
    }

    /**
     * Вывести информацию о самом неуспевающем студенте
     * @return
     * @throws IOException
     */
    public static Student mostUnsuccessfulStudentMan() throws IOException {
        Map<Student, OptionalDouble> average = read()
                .stream()
                .filter(student -> student.getGender().equals("man"))
                .collect(Collectors.toMap(student -> student, student -> Arrays.stream(student.getGrades()).average()));
        Student student = average.keySet().stream().min(
                Comparator.comparingDouble(s -> average.getOrDefault(s, OptionalDouble.of(0.0)).getAsDouble())
        ).get();

        return student;
    }

    /**
     * Вывести информацию о самой успевающей студентке
     * @return
     * @throws IOException
     */
    public static Student mostSuccessfulStudentWoman() throws IOException {
        Map<Student, OptionalDouble> average = read()
                .stream()
                .filter(student -> student.getGender().equals("woman"))
                .collect(Collectors.toMap(student -> student, student -> Arrays.stream(student.getGrades()).average()));
        Student student = average.keySet().stream().max(
                Comparator.comparingDouble(s -> average.getOrDefault(s, OptionalDouble.of(0.0)).getAsDouble())
        ).get();

        return student;
    }

    /**
     * Вывести информацию о самом неуспевающей студентке
     * @return
     * @throws IOException
     */
    public static Student mostUnsuccessfulStudentWoman() throws IOException {
        Map<Student, OptionalDouble> average = read()
                .stream()
                .filter(student -> student.getGender().equals("woman"))
                .collect(Collectors.toMap(student -> student, student -> Arrays.stream(student.getGrades()).average()));
        Student student = average.keySet().stream().min(
                Comparator.comparingDouble(s -> average.getOrDefault(s, OptionalDouble.of(0.0)).getAsDouble())
        ).get();

        return student;
    }

    /**
     * Вывести список студенток, получающих стипендию
     * @return
     * @throws IOException
     */
    public static List<Student> scholarshipWoman() throws IOException {
        return read()
                .stream()
                .filter(student ->
                        student.getGender().equals("woman")
                                && Arrays.stream(student.getGrades()).allMatch(x -> x >= 4))
                .collect(Collectors.toList());
    }

    /**
     * Вывести список студенток, не получающих стипендию
     * @return
     * @throws IOException
     */
    public static List<Student> noScholarshipMan() throws IOException {
        return read()
                .stream()
                .filter(student ->
                        student.getGender().equals("man")
                                && Arrays.stream(student.getGrades()).anyMatch(x -> x < 4))
                .collect(Collectors.toList());
    }

    /**
     * Вывести список студентов, получающих стипендию
     * @return
     * @throws IOException
     */
    public static List<Student> scholarshipMan() throws IOException {
        return read()
                .stream()
                .filter(student ->
                        student.getGender().equals("man")
                                && Arrays.stream(student.getGrades()).allMatch(x -> x >= 4))
                .collect(Collectors.toList());
    }

    /**
     * Вывести список студентов, не получающих стипендию
     * @return
     * @throws IOException
     */
    public static List<Student> noScholarshipWoman() throws IOException {
        return read()
                .stream()
                .filter(student ->
                        student.getGender().equals("woman")
                                && Arrays.stream(student.getGrades()).anyMatch(x -> x < 4))
                .collect(Collectors.toList());
    }

    /**
     * Вывести список студентов-отличников
     * @return
     * @throws IOException
     */
    public static List<Student> excellentStudent() throws IOException {
        return read()
                .stream()
                .filter(student -> Arrays.stream(student.getGrades()).allMatch(x -> x == 5))
                .collect(Collectors.toList());
    }




}
