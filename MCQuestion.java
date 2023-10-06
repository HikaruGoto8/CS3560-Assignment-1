import java.util.ArrayList;
public class MCQuestion implements Question
{
    private String question;
    private ArrayList<String> choices;

    /* Constructor for MCQuestion */
    public MCQuestion(String question, ArrayList<String> choices)
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
