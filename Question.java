import java.util.List;

/*
 * Abstract class that is used for question
 */
public abstract class Question {
    private String questionType;
    private String questionPrompt;
    protected List<String> answers;

    /*
     * Construtor used to create question
     * @param type: Type of answers to question (SingleChoice or MultipleChoice)
     * @param question: The question being asked
     * @param answer: The list of answers to the question
     */
    public Question(String type, String question, List<String> answer){
        this.questionType=type;
        this.questionPrompt=question;
        this.answers=answer;
    }

    //Get methods
    public String getQuestion() {
        return this.questionPrompt;
    }

    public String getQuestionType() {
        return this.questionType;
    }

    public List<String> getAnswers() {
        return this.answers;
    }
 
    //Set methods
    public void setQuestion(String question) {
        this.questionPrompt = question;
    }

    public void setQuestionType(String type) {
        this.questionType = type;
    }

    public void setAnswers(List<String> answer) {
        this.answers = answer;
    }

}

