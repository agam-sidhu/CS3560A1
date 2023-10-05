import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* 
 * Student Class that contains a Student's ID and answers to a given question
 */
public class Student{
    private List<String> studentAnswer;
    private String id;
    
    //Default constructor
    public Student() {
        this.id = UUID.randomUUID().toString();
        this.studentAnswer = new ArrayList<>(); 
    }

    /*Alternate constructor with specified answers
    * @param answer: List of answers
    */
    public Student(List<String> answer){
        this.id = UUID.randomUUID().toString();
        this.studentAnswer = answer;
    }

    //Get methods
    public String getId(){
        return this.id;
    }

    public List<String> getAnswers(){
        return this.studentAnswer;
    }

    //Set methods
    public void setAnswers(String answer){
        studentAnswer.add(answer);
    }

    public void setId(String newId){
        this.id = newId;
    }

    /*Adds an answer to a student
    * @param answer: The answer selected
    */
    public void addAnswer(String answer) {
        studentAnswer.add(answer);
    }

    /*Adds a list of answers to a student
    * @param answer: The list of answers selected
    */
    public void addAnswers(List<String> answers){
        studentAnswer.addAll(answers);
    }

    //Returns the Student's answers as a string
    public String getAnswerAsString() {
        StringBuilder res = new StringBuilder();
        for (String answer : studentAnswer) {
            if (res.length() > 0) {
                res.append(", "); 
            }
            res.append(answer);
        }
        return res.toString();
    }

    //Returns the student's answers as comma seperated and alphabetical ordered string
    public String getAnswersAsString() {
        List<String> sortedChar = new ArrayList<>(studentAnswer);
        Collections.sort(sortedChar); //Sorts the answers alphabetically
        StringBuilder res = new StringBuilder();
        
        for (String answer : sortedChar) {
            if (res.length() > 0) {
                res.append(", "); //adds a comma in between each answer selected
            }
            res.append(answer);
        }

        return res.toString();
    }
    
}