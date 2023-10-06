import java.util.HashMap;
import java.util.ArrayList;
public class VotingService
{
    private String questionType;
    private Question question;
    private HashMap<Student, ArrayList<String>> studentAnsList;
    private ArrayList<Student> studentList;

    /* VotingService Constructor. */
    public VotingService(String question, String questionType, ArrayList<String> choices)
    {
        this.questionType = questionType;
        if(questionType.equals("single choice"))
        {
            this.question = new SCQuestion(question, choices);
        }
        else {
            this.question = new MCQuestion(question, choices);
        }
        this.studentAnsList = new HashMap<>();

    }

    /* Takes in a student and their answer and puts it into the studentAnsList Map. */
    public void studentSubmission(Student student, String studentAns)
    {
        if(studentAnsList.containsKey(student))
        {
            if(questionType.equals("single choice"))
            {
                /* If the student is already in the map and the question is single choice, replace the current answer. */
                studentAnsList.get(student).set(0, studentAns);
            }
            else
            {
                /* Otherwise, add it into the student's answer list. */
                studentAnsList.get(student).add(studentAns);
            }
        }
        else
        {
            /* Adds a new student to the map. */
            ArrayList<String> currentAns = new ArrayList<>();
            currentAns.add(studentAns);
            studentAnsList.put(student,currentAns);
        }

    }

    public void displayStat()
    {
        /* Contains the answer choice and the amount of times it was selected. */
        HashMap<String, Integer> results = new HashMap<>();
        ArrayList<String> choices = question.getChoices();

        /* Puts all choices into the result map, and initializes all total values to 0. */
        for(int i = 0; i < choices.size(); i++)
        {
            results.put(choices.get(i), 0);
        }

        /* Iterates through each student's answer list and counts how many times each choices was selected. */
        for(ArrayList<String> answerList : studentAnsList.values())
        {
            for(String answer : answerList)
            {
                results.put(answer, results.get(answer) + 1);
            }

        }

        /* Prints each choice and the amount of times it was selected. */
        for(int i = 0; i < choices.size(); i++)
        {
            System.out.println(choices.get(i) + ": " + results.get(choices.get(i)));
        }
    }

}