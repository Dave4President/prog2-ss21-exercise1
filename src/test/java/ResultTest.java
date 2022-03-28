import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultTest {

    @Test
    void isStudentCountValid() {
        boolean actual = Result.isStudentCountValid(66);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void isStudenCounValid2() {
        boolean actual = Result.isStudentCountValid(45);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    void isGradeValid() {
        boolean actual = Result.isGradeValid(0);
        boolean expected = true;
        assertEquals(actual, expected);

    }

    @Test
    void isGradeValid2() {
        boolean actual = Result.isGradeValid(101);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void isGradeToBeRounded() {
        boolean actual = Result.gradeToBeRounded(37);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void isGradeToBeRounded2() {
        boolean actual = Result.gradeToBeRounded(76);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void isGradeToBeRounded3() {
        boolean actual = Result.gradeToBeRounded(74);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    void gradingStudents() {
        List<Integer> expected = Arrays.asList(75, 67, 40, 33);
        List<Integer> grades = Arrays.asList(4, 73, 67, 38, 33);
        List<Integer> actual = Result.gradingStudents(grades);
        assertEquals(actual, expected);
    }






}