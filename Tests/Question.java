import java.util.*;
public class Question {
    //variables
    private String question;
    private TreeMap<String, Boolean> answers = new TreeMap<>();

    //sets the value of the question variable
    public Question(String questionValue){
        question = questionValue;
    }//end Question

    //gets the question variable
    public String GetQuestion(){
        return question;
    }//end GetQuestion

    //adds an answer that use can select
    public void AddAnswer(String answer, boolean isCorrect){
        answers.put(answer, isCorrect);
    }//end AddAnswer method

    //adds true-false answers
    public void AddAnswer(String answer){
        //sets correct answer to true
        if(answer.toLowerCase().equals("true")){
            AddAnswer("True", true);
            AddAnswer("False", false);
        } else{
            //sets correct answer to false
            AddAnswer("False", true);
            AddAnswer("True", false);
        }//end if-else
    }//end AddAnswer method
    
    //obtains all answers from question
    public String[] getAnswers(){
        int i = 0;
        String[] results = new String[answers.size()];
        for(String answer : answers.keySet()){
            results[i] = answer;
            i++;
        }
       return results;
    }

    //uses the question (which is the key) to return the value(which is a boolean)
    public boolean CheckAnswer(String question) {
        return answers.get(question);
    }//end CheckAnswer method
    
}// end Question class
