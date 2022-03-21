import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Result2 {
    static int grade;
    static int students;
    static Result2 result = new Result2();

    public static int numberOfStudents;

    // TO DO, erster Eintrag -> Anzahl Students
    // zweiter Eintrag -> grades

    protected static boolean studentCountValid(int students){
        return(0 < students && students <= 60);
    }
    protected static boolean gradeValid(int grade){
        return(0<= grade && grade <= 100);
    }
    protected static boolean gradeToBeRounded(int grade){
        return((grade >= 38) && (grade%5 == 3 || grade%5 == 4));
    }




    public static List<Integer> gradingStudents(List<Integer> grades){

        grades = new ArrayList<>(students);
        int numberOfStudents;




        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {

        }

        if (result.studentCountValid(students)){

            for (int i = 0; i < grades.size(); i++){





                if (result.gradeValid(grade)){

                    if (i == 0) {
                        numberOfStudents = grade;
                        break;
                    }

                    results.add(grade);

                    for (int j =0; j < grades.size(); j++){

                        if (result.gradeToBeRounded(grade)){
                            grade = grade+(5-(grade%5));
                        }
                    }
                }
            }
        }


        return results;
    }

    public static void main(String[] args){
        Result2 e = new Result2();
        List<Integer> grades = new ArrayList<>();
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        gradingStudents(grades);






    }
}
