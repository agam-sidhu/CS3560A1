import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Class that simulates answers chosen by students
 */
public class Simulator {

    /*
     * @param question: The question students are answering
     * @param vote: The voting service that incorporates the studet's submission
     * @param student: The students that submited a choice
     */
    public static void submissionSimulator(Question question, VotingService vote, List<Student> students) {
        Random random = new Random();
        for (Student student : students) { 
            int index = random.nextInt(question.getAnswers().size()); 
            String chosenAnswer = question.getAnswers().get(index); //randomly choses an answer

            List<String> sub = new ArrayList<>();
            sub.add(chosenAnswer);

            vote.chosenAnswer(student, sub);
        }
    }
}
