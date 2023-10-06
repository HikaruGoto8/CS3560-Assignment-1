import java.util.ArrayList;
public class SCQuestion implements Question
{
    private String question;
    private ArrayList<String> choices;

    /* Constructor for SCQuestion. */
    public SCQuestion(String question, ArrayList<String> choices)
    {
        this.question = question;
        this.choices = choices;
    }
    public String getQuestion()
    {
        return this.question;
    }

    public ArrayList<String> getChoices()
    {
        return this.choices;
    }



}
