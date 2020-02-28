package ru.job4j.opp.lambda;

import org.junit.Test;
import ru.job4j.oop.lambda.School;
import ru.job4j.oop.lambda.Student;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import java.util.Arrays;
import java.util.List;

public class SchoolTest {

    private School school = new School();

    private List<Student> students = Arrays.asList(
            new Student(100),
            new Student(89),
            new Student(57),
            new Student(90),
            new Student(34),
            new Student(10),
            new Student(75)
    );

    @Test
    public void whenStudentScoreRange0To50() {
        List<Student> result = school.collect(students, student -> student.getScore() > 0 && student.getScore() < 50);
        List<Student> expect = List.of(new Student(10), new Student(34));
        assertThat(result, is(expect));
    }

    @Test
    public void whenStudentScoreRange50To70() {
        List<Student> result = school.collect(students, student -> student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expect = List.of(new Student(57));
        assertThat(result, is(expect));
    }

    @Test
    public void whenStudentScoreRange70To100() {
        List<Student> result = school.collect(students, student -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> expect = List.of(new Student(75), new Student(89), new Student(90), new Student(100));
        assertThat(result, is(expect));
    }
}
