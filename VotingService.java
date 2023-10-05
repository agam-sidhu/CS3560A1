import java.util.ArrayList;
import java.util.List;

/*
 * Class that tracks submissions and calculates answer results
 */
public class VotingService {
    private Question question;
    private List<Student> students;
    private List<List<String>> submission;

    /*
     * Constructor that takes two inputs
     * @param inquiry: The question being asked
     * @param students: The list of students
     */
    public VotingService(Question inquiry, List<Student> students) {
        this.question = inquiry;
        this.students = students;
        this.submission = new ArrayList<>();
        submissionBuilder();
    }

    //Method that creates an empty submission list for each student 
    private void submissionBuilder() {
        int numStudents = students.size();
        for (int i = 0; i < numStudents; i++) {
            this.submission.add(new ArrayList<>());
        }
    }

    /*
     * Method that records answers chosen by the student
     * @param student: The student who submitted an answer
     * @param answers: The list of answers by that student
     */
    public void chosenAnswer(Student student, List<String> answers) {
        if (question != null) {
            int index = students.indexOf(student);
            if (index != -1) {
                this.submission.set(index, answers);
            }
        }
    }
    /*
     * Method that prints the results of each student
     * @param student: The list of students
     */
    public void showAnswerResults(List<Student> students) {
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
        
            for (Student student : students) {
                List<String> chosenAnswers = student.getAnswers();
                //sees if the answer is A B C D and increments if the answer is one of the answers
                if (chosenAnswers.contains("A")) {
                    a++;
                }
                if (chosenAnswers.contains("B")) {
                    b++;
                }
                if (chosenAnswers.contains("C")) {
                    c++;
                }
                if (chosenAnswers.contains("D")) {
                    d++;
                }
            }
            
            System.out.println("Results for " + students.size() + " Students: ");
            if(a+b+c+d == students.size()){
                System.out.println("Single Choice");
            }else{
                System.out.println("Multiple Choice");
            }
            System.out.println("A: " + a);
            System.out.println("B: " + b);
            System.out.println("C: " + c);
            System.out.println("D: " + d);
        }
        
        /*
         * Method that prints the id of the students
         * @param student: List of students
         */
        public void showSingleAnswerId(List<Student> students){
            for (Student student : students){
                System.out.println("User ID: " + student.getId() + " Answer: " + student.getAnswerAsString());
            }
            System.out.println("****************************************************************");
        }
        
         /*
         * Method that prints the id of the students
         * @param student: List of students
         */
        public void showMultAnswerId(List<Student> students){
            for (Student student : students){
                System.out.println("User ID: " + student.getId() + " Answer: " + student.getAnswersAsString());
            }
            System.out.println("****************************************************************");
        }
}
