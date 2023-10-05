import java.util.List;
import java.util.Random;

/*
 * Class that is used for a single answer questions
 */
public class SingleAnswer extends Question {
    
    /*
     * Constructor used to create a single-choice question.
     * @param question: The question prompted by the teacher
     * @param type: The type of answer choice
     * @param answer: The list of answers that can be selected from the given question 
     */
    public SingleAnswer(String question, String type, List<String> answer) {
        super(question, "Single Choice", answer);
    }

    //Get methods
    public String getQuestionPrompt(){
        return getQuestion();
    }

    public String getQuestionType() {
        return getQuestionType();
    }

    public List<String> getStudentAnswer() {
        return getAnswers();
    }

    //Set methods
    public void setStudentAnswer(List<String> newAnswer){
        setAnswers(newAnswer);
    }

    public void setQuestionPrompt(String newQuestion){
        setQuestion(newQuestion);
    }

    //Function designed to create random answers that the student would select
    public String generateAnswer(){
        Random random = new Random();
        // Generate a random integer between 1 and 4 (inclusive)
        int randomNum = random.nextInt(4) + 1;
        String newAnswer = "";
        if(randomNum == 1){
            newAnswer = "A";
        }
        if(randomNum == 2){
            newAnswer = "B";
        }
        if(randomNum == 3){
            newAnswer = "C";
        }
        if(randomNum == 4){
            newAnswer = "D";
        }
        return newAnswer;
    }    
}
