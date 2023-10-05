import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Class that is used for a Multiple answer questions
 */
public class MultipleAnswer extends Question {

    /*
     * Constructor used to create a single-choice question.
     * @param question: The question prompted by the teacher
     * @param type: The type of answer choice
     * @param answers: The list of answers that can be selected from the given question 
     */
    public MultipleAnswer(String type, String question, List<String> answers) {
        super(type, question, answers);
    }

    //Get methods
    public List<String> getStudentAnswer() {
        return getAnswers();
    }

    public String getQuestionPrompt(){
        return getQuestion();
    }

    //Set methods
    public void setStudentAnswer(List<String> newAnswer){
        setAnswers(newAnswer);
    }

    public void setQuestionPrompt(String newQuestion){
        setQuestion(newQuestion);
    }

    //Function designed to generate random answers that the student would select
    public List<String> generateAnswers(){
        Random random = new Random();
        int numAnswers = random.nextInt(4) + 1; // Generate a random number of answers (between 1 and 4)
        List<String> answers = new ArrayList<>();

        while (answers.size() < numAnswers) {
            String answer = createAnswer();
            if (!answers.contains(answer)) { //Checks to see if answer hasn't been selected
                answers.add(answer);
            }
        }
        return answers;
    }

    //Function that creates a random answer the user would selecte
    public String createAnswer(){
        Random random = new Random();
        // Generate a random integer between 1 and 4 (inclusive)
        int randomNumber = random.nextInt(4) + 1;
        String newAnswer = "";
        if(randomNumber == 1){
            newAnswer = "A";
        }
        if(randomNumber== 2){
            newAnswer = "B";
        }
        if(randomNumber== 3){
            newAnswer = "C";
        }
        if(randomNumber== 4){
            newAnswer = "D";
        }
        return newAnswer;
    }  
    
}
