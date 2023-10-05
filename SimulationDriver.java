import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Simulation Driver class that runs the main simulation
 */
public class SimulationDriver {
    public static void main(String[] args) {

        //A list options that could be selected by the student
        List<String> options = new ArrayList<>();
        options.add("A");
        options.add("B");
        options.add("C");
        options.add("D");
        
        //Generates a random number of students from 1 to 50
        Random random = new Random(); 
        int numOfStudents = random.nextInt(50) + 1;

        //Builds a single answer question
        Question singleChoice = new SingleAnswer("What is your favorite color?","Single", options);
        
        //Creates students
        List<Student> studentsSingle = UserGenerator.generateStudents(numOfStudents, singleChoice); 

        VotingService votingServiceSingle = new VotingService(singleChoice, studentsSingle);

        // Simulates the submissions made by students
        Simulator.submissionSimulator(singleChoice, votingServiceSingle, studentsSingle);

        // Prints results and IDs of students
        votingServiceSingle.showAnswerResults(studentsSingle);
        votingServiceSingle.showSingleAnswerId(studentsSingle);

        //Builds a multiple answer question
        Question multipleChoice = new MultipleAnswer("Multiple", "What are your favorite colors?", options);
        
        //Creates students
        List<Student> studentsMult = UserGenerator.generateStudents(numOfStudents, multipleChoice); 

        VotingService votingServiceMult = new VotingService(multipleChoice, studentsMult);

        //Simulates the submissions made by students
        Simulator.submissionSimulator(multipleChoice, votingServiceMult, studentsMult);

        //Prints results and IDs of students
        votingServiceMult.showAnswerResults(studentsMult);
        votingServiceMult.showMultAnswerId(studentsMult);
    }
}
