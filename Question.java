import java.util.ArrayList;
public interface Question {
    /**
     *  Method: getQuestion
     *  Purpose: Gets the question prompt.
     *  Return: Returns the question prompt.
     * **/
    public String getQuestion();

    /**
     *  Method: getChoices
     *  Purpose: Gets the choices to the question.
     *  return: Returns the questions to the choices.
     * **/
    public ArrayList<String> getChoices();

}
