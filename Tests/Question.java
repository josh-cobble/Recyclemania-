import java.util.*;
public class Question {
    //variables
    private String question;
    private TreeMap<String, Boolean> answers = new TreeMap<>();
    String[] explanations;

    ArrayList<String> uniExplain = new ArrayList<>();

    private void SetExplanations(){
        uniExplain.add("some contaminants can ruin recycling machines and the quality of the materials");
        uniExplain.add("Some coated/mixed materials can't always be recycled because separating them can be difficult");
        uniExplain.add("Some glass types have properties, such as higher melting point, that make them incompatible with standard recycling processes");
        uniExplain.add("many plastics can be toxic and some can be too expensive/difficult to recyclable");
        uniExplain.add("Certain metals aren't recycled because they are either too toxic or too radioactive");
        uniExplain.add("broken glass can be too dangerous to be recycled safely");
    }

    public void AddExplanations( int[] elements){
        explanations = new String[elements.length];
        for(int i = 0; i < elements.length; i++){
            explanations[i] = uniExplain.get(elements[i]);
        }
    }

    //======================================================================

    //sets the value of the question variable
    public Question(String questionValue){
        question = questionValue;
        SetExplanations();
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
