import java.util.ArrayList;
import java.util.List;

public class Result {

    static int students;

    protected static boolean isStudentCountValid(int students) {
        return (0 < students && students <= 60);
    }

    protected static boolean isGradeValid(int grade) {
        return (0 <= grade && grade <= 100);
    }

    protected static boolean gradeToBeRounded(int grade) {
        return (grade >= 38 && grade % 5 >= 3);
    }

    public static List<Integer> gradingStudents(List<Integer> grades){

        students = grades.get(0);
        int tempGrade = 0;

        List<Integer> finalGrades = new ArrayList<Integer>(students);

        if (isStudentCountValid(students)) {

            for (int i = 1; i < grades.size(); i++) {
                if (gradeToBeRounded(grades.get(i))) {
                    tempGrade = grades.get(i) + (5 - (grades.get(i) % 5));
                    finalGrades.add(tempGrade);
                }
                else {
                    finalGrades.add(grades.get(i));
                }
            }
        }
        return finalGrades;
    }
}
