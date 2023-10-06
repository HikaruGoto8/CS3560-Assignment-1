public class Student {
    /* Keeps track of what the next ID number will be. */
    public static int nextID = 1;
    private String id;
    private String studentAnswer;

    /* Constructor for Student. */
    public Student()
    {
        this.id = "Student#" + nextID;
        nextID++;
    }

    public void setAnswer(String input)
    {
        this.studentAnswer = input;
    }
    public String getAnswer()
    {
        return this.studentAnswer;
    }
    public String getId()
    {
        return this.id;
    }
}
