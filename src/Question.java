/*

 */

/**
 *
 * @author Timothy Madding
 */
public class Question {
    private String question;
    private String answer;
    private String subject;
    private String chapter;
    private boolean hasBeenUsed = false;
    private boolean hasBeenAnsweredCorrectly = false;
    
    public Question(String question, String answer,String subject,String chapter){
        this.question = question;
        this.answer = answer;
        this.subject = subject;
        this.chapter = chapter;
    }
    public Question(){
        question = "";
        answer = "";
        subject ="";
        chapter = "";
    }
    public void setQuestion(String question){
        this.question = question;
    }
    public String getQuestion(){
        return question;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }
    public String getAnswer(){
        return answer;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setChapter(String chapter){
        this.chapter = chapter;
    }
    public String getChapter(){
        return chapter;
    }
    public void resetValues(){
        hasBeenAnsweredCorrectly = false;
        hasBeenUsed = false;
    }
    public void checkAnswer(String testAnswer){
        testAnswer = testAnswer.toUpperCase();
        if(testAnswer.equals(answer.toUpperCase())){
            hasBeenAnsweredCorrectly = true;
        }
        hasBeenUsed = true;
    }   
}
