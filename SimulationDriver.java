/**************************************************************/
/* Hikaru Goto */
/* CS 3560, Fall 2023 */
/* Assignment 1 */
/* Date: October 5th, 2023 */
/**************************************************************/

import java.util.*;
public class SimulationDriver
{
    public static void main(String[] args) {
        /* Create list of choices for the question. */
        ArrayList<String> choices = new ArrayList<>();
        choices.add("A");
        choices.add("B");
        choices.add("C");
        choices.add("D");

        /* Sample question text. */
        String question = "QUESTION SAMPLE?";

        /* Create VotingService. */
        VotingService votingService = new VotingService(question, "multiple choice", choices);

        /* Create Random object to determine the number of students. (Limit of 30) */
        Random random = new Random();
        int numStudents = random.nextInt(30) + 1;

        System.out.println("MULTIPLE CHOICE TEST");
        System.out.println(question);
        System.out.println("Total Number of Students: " + numStudents);

        /* Multiple Choices Test */
        for (int i = 0; i < numStudents; i++) {
            Student student = new Student();
            int numStudentAns = random.nextInt(4) + 1;

            /* Randomly chooses from one of the choices to "create" a student choice. */
            String randomAnswer = choices.get(random.nextInt(choices.size()));
            student.setAnswer(randomAnswer);

            /* Puts the student's answer into system. */
            votingService.studentSubmission(student, student.getAnswer());

            /* Repeat twice to simulate if multiple choice works. */
            randomAnswer = choices.get(random.nextInt(choices.size()));
            student.setAnswer(randomAnswer);

            votingService.studentSubmission(student, student.getAnswer());
        }

        /* Display the statistic. */
        votingService.displayStat();

        /* Single Choice Test */
        votingService = new VotingService(question, "single choice", choices);
        numStudents = random.nextInt(30) + 1;

        System.out.println("\nSINGLE CHOICE TEST");
        System.out.println(question);
        System.out.println("Total Number of Students: " + numStudents);

        for (int i = 0; i < numStudents; i++) {
            Student student = new Student();

            String randomAnswer = choices.get(random.nextInt(choices.size()));
            student.setAnswer(randomAnswer);

            votingService.studentSubmission(student, student.getAnswer());

            randomAnswer = choices.get(random.nextInt(choices.size()));
            student.setAnswer(randomAnswer);

            votingService.studentSubmission(student, student.getAnswer());
        }

        votingService.displayStat();
    }
}
