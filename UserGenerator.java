import java.util.ArrayList;
import java.util.List;

/*
 * Class that generates students and adds random answers to each student based on the type of question selection
 */
public class UserGenerator{

    /*
     * Method to create the students and their answer
     * @param numStudets: The number of students in the class
     * @param question: The question object that specifies where answers will be sent to
    */
    public static List<Student> generateStudents(int numStudents, Question question) {
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= numStudents; i++) {
            Student student = new Student();
            if (question instanceof SingleAnswer) {

                SingleAnswer singleAnswerQuestion = (SingleAnswer) question;
                String answer = singleAnswerQuestion.generateAnswer(); 
                student.addAnswer(answer); //Add answers

            } else if (question instanceof MultipleAnswer) {

                MultipleAnswer multAnswerQuestion = (MultipleAnswer) question;
                List<String> answers = multAnswerQuestion.generateAnswers();
                student.addAnswers(answers); //Add answers
            }
            students.add(student); //Adds students
        }
        return students;
    }
}