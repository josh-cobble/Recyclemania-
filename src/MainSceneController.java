import java.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;

import java.net.URL;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import javafx.scene.layout.VBox;




public class MainSceneController implements Initializable{


 @FXML
 private Label MainLogo;
 
 @FXML
 private ImageView GreyGrid;

 @FXML
 private Button Quiz;

 @FXML
 private Button LearnButton;




 @FXML
 private Label WrongFeedback;

 @FXML
 private Label Question;


 @FXML
 private Button Q1;

 @FXML
 private Button Q2;

 @FXML
 private Button Q3;

 @FXML
 private Button Q4;

 @FXML
 private ImageView Incorrect;

 @FXML
 private ImageView Correct;

 @FXML
 private Button reset;

 @FXML
 private VBox LearnVBox;

    @FXML
    private TextArea AAAA;


 
 @FXML
 private Button ExitLearn;


 @FXML
 private Button FeedbackButton;

 @FXML
 private ProgressBar ProgressBar;


public static boolean trueFalseQuestion;

public static int questionNumber = 0;

public static boolean easyQuestions = true;

public static int numberCorrect = 0;

public static int chosenAwnser = 0;




 TestsRecycling.SimpleQuestions simpleQuestions= new TestsRecycling().new SimpleQuestions(); 
 TestsRecycling.ComplexQuestions complexQuestions= new TestsRecycling().new ComplexQuestions();




 @Override
 public void initialize(URL arg0, ResourceBundle arg1) {
  

WrongFeedback.setVisible(false);
  Question.setVisible(false);

  reset.setVisible(false);
  reset.setDisable(true);

  Q1.setVisible(false);
  Q2.setVisible(false);
  Q3.setVisible(false);
  Q4.setVisible(false);



LearnVBox.setVisible(false);


  Correct.setVisible(false);
  Incorrect.setVisible(false);

  FeedbackButton.setDisable(true);
  FeedbackButton.setVisible(false);

  AAAA.setVisible(false);

  // translate
  TranslateTransition translate = new TranslateTransition();
  translate.setNode(MainLogo);
  translate.setDuration(Duration.millis(2000));
  translate.setCycleCount(TranslateTransition.INDEFINITE);
  translate.setByY(10);
  translate.setAutoReverse(true);
  translate.play();




  // translate
  TranslateTransition translate2 = new TranslateTransition();
  translate2.setNode(GreyGrid);

  translate2.setDuration(Duration.millis(90000));
  translate2.setCycleCount(TranslateTransition.INDEFINITE);
  translate2.setByY(600);
  translate2.setAutoReverse(true);
  translate2.play();
  





  /*
  // rotate
  RotateTransition rotate = new RotateTransition();
  rotate.setNode(myImage);
  rotate.setDuration(Duration.millis(500));
  rotate.setCycleCount(TranslateTransition.INDEFINITE);
  rotate.setInterpolator(Interpolator.LINEAR);
  rotate.setByAngle(360);
  rotate.setAxis(Rotate.Z_AXIS);
  rotate.play();
   
  // fade
  FadeTransition fade = new FadeTransition();
  fade.setNode(myImage);
  fade.setDuration(Duration.millis(1000));
  fade.setCycleCount(TranslateTransition.INDEFINITE);
  fade.setInterpolator(Interpolator.LINEAR);
  fade.setFromValue(0);
  fade.setToValue(1);
  fade.play();

  // scale
  ScaleTransition scale = new ScaleTransition();
  scale.setNode(myImage);
  scale.setDuration(Duration.millis(1000));
  scale.setCycleCount(TranslateTransition.INDEFINITE);
  scale.setInterpolator(Interpolator.LINEAR);
  scale.setByX(2.0);
  scale.setByY(2.0);
  scale.setAutoReverse(true);
  scale.play();
  */



 } 

 @FXML
 void Quiz(ActionEvent event) {



    Quiz.setDisable(true);
    Quiz.setVisible(false);
    LearnButton.setDisable(true);
    LearnButton.setVisible(false);


    WrongFeedback.setVisible(false);

    //Question
    Question.setVisible(true);
    Question.setText(simpleQuestions.questions[questionNumber].GetQuestion());



    String ResponseArray[]  = simpleQuestions.questions[questionNumber].getAnswers().clone();

    if (ResponseArray.length == 2) {

        Q1.setDisable(true);
        Q4.setDisable(true);

        Q4.setVisible(false);
        Q1.setVisible(false);

        Q2.setVisible(true);
        Q3.setVisible(true);

        
        Q2.setText("True");
        Q3.setText("False");

        trueFalseQuestion = true;

    }


    }


  @FXML
    void LearnButtonPressed(ActionEvent event) {

        Quiz.setDisable(true);
        Quiz.setVisible(false);
        LearnButton.setDisable(true);
        LearnButton.setVisible(false);
        LearnVBox.setVisible(true);
        AAAA.setVisible(true);

    }

    @FXML
void ExitLearnPressed(ActionEvent event) {

    Quiz.setDisable(false);
    Quiz.setVisible(true);
    LearnButton.setDisable(false);
    LearnButton.setVisible(true);
    LearnVBox.setVisible(false);
    AAAA.setVisible(false);

    }




    //BUTTONS PRESSED OR NOT

    @FXML
    void Q1Pressed(ActionEvent event) {
        chosenAwnser = 1;
        //Hard questions awnser checking
        if (complexQuestions.questions[questionNumber].CheckAnswer(Q1.getText()) == true) {

            System.out.println("You got it right!");
            FeedbackButton.setText("That's right!");
            WrongFeedback.setText("Great work! Thats correct!");
            WrongFeedback.setVisible(true);
            numberCorrect = numberCorrect + 1;
            Correct.setVisible(true);
        }
        else {
            System.out.println(Q1.getText());
            System.out.println(complexQuestions.questions[questionNumber].getAnswers());
            System.out.println("You got it wrong.");
            Incorrect();
            

        }
        
        giveFeedbackOnQuestion();

    }

    @FXML
    void Q2Pressed(ActionEvent event) {
        chosenAwnser = 2;
        if (easyQuestions == true) {
            if (trueFalseQuestion == true) {

                if (simpleQuestions.questions[questionNumber].CheckAnswer("True")== true) {

                    System.out.println("You got it right!");
                    FeedbackButton.setText("That's right!");
                    WrongFeedback.setText("Great work! Thats correct!");
                    WrongFeedback.setVisible(true);
                    Correct.setVisible(true);
                    numberCorrect = numberCorrect + 1;
                }
                else {
                    System.out.println("You got it wrong. Womp womp.");
                    Incorrect();

                }


                
                giveFeedbackOnQuestion();
            }
        } else {
            //Hard questions awnser checking
            if (complexQuestions.questions[questionNumber].CheckAnswer(Q2.getText()) == true) {

                System.out.println("You got it right!");
                FeedbackButton.setText("That's right!");
                WrongFeedback.setText("Great work! Thats correct!");
                WrongFeedback.setVisible(true);
                Correct.setVisible(true);
                numberCorrect = numberCorrect + 1;
            }
            else {
                System.out.println("You got it wrong. Womp womp.");
                Incorrect();

            }
            
            giveFeedbackOnQuestion();
        }
        
    }

    @FXML
    void Q3Pressed(ActionEvent event) {
        chosenAwnser = 3;

        if (easyQuestions == true) {
            if (trueFalseQuestion == true) {

                if (simpleQuestions.questions[questionNumber].CheckAnswer("False") == true) {

                    System.out.println("You got it right!");
                    FeedbackButton.setText("That's right!");
                    WrongFeedback.setText("Great work! Thats correct!");
                    WrongFeedback.setVisible(true);
                    Correct.setVisible(true);
                    numberCorrect = numberCorrect + 1;
                }
                else {
                    System.out.println("You got it wrong. Womp womp.");
                    Incorrect();

                }

                
                giveFeedbackOnQuestion();
            }
        } else {
            //Hard questions awnser checking
            if (complexQuestions.questions[questionNumber].CheckAnswer(Q3.getText()) == true) {

                System.out.println("You got it right!");
                FeedbackButton.setText("That's right!");
                WrongFeedback.setText("Great work! Thats correct!");
                WrongFeedback.setVisible(true);
                Correct.setVisible(true);
                numberCorrect = numberCorrect + 1;
            }
            else {
                System.out.println("You got it wrong. Womp womp.");
                Incorrect();

            }

            
            giveFeedbackOnQuestion();
        }
        
    }

    @FXML
    void Q4Pressed(ActionEvent event) {
        chosenAwnser = 4;
        if (complexQuestions.questions[questionNumber].CheckAnswer(Q3.getText()) == true) {

            System.out.println("You got it right!");
            FeedbackButton.setText("That's right!");
            WrongFeedback.setText("Great work! Thats correct!");
            WrongFeedback.setVisible(true);
            Correct.setVisible(true);
            numberCorrect = numberCorrect + 1;
        }
        else {
            System.out.println("You got it wrong. Womp womp.");
            Incorrect();

        }

        
        giveFeedbackOnQuestion();

    }


    public void giveFeedbackOnQuestion() {

        //Valueable Feedback


        Q1.setDisable(true);
        Q2.setDisable(true);
        Q3.setDisable(true);
        Q4.setDisable(true);

        Q1.setVisible(false);
        Q2.setVisible(false);
        Q3.setVisible(false);
        Q4.setVisible(false);

        FeedbackButton.setVisible(true);
        FeedbackButton.setDisable(false);

        questionNumber = questionNumber + 1;
    }



    @FXML
    void FeedbackButtonPressed(ActionEvent event) {

        SetUpNextQuestion();

        Correct.setVisible(false);
        Incorrect.setVisible(false);
    }



    public void SetUpNextQuestion() {


        WrongFeedback.setVisible(false);
        WrongFeedback.setText("Great work! Thats correct!");
        FeedbackButton.setVisible(false);
        FeedbackButton.setDisable(true);

        if (questionNumber >= 10) {

            if (easyQuestions == true) {
                easyQuestions = false;
                questionNumber = 0;

            } else {
                EndOfLine();

                return;

            }


        }



        ProgressBar.setProgress(ProgressBar.getProgress()+0.05);
        System.out.println("Setting up next question");


        Question.setVisible(true);


        Quiz.setDisable(true);
        Quiz.setVisible(false);
        LearnButton.setDisable(true);
        LearnButton.setVisible(false);
        //Question
        Question.setVisible(true);



        if (easyQuestions == true) {
            Question.setText(simpleQuestions.questions[questionNumber].GetQuestion());
            String ResponseArray[]  = simpleQuestions.questions[questionNumber].getAnswers().clone();
            if (ResponseArray.length == 2) {
    
                Q1.setDisable(true);
                Q4.setDisable(true);
        
                Q3.setDisable(false);
                Q2.setDisable(false);
    
                Q4.setVisible(false);
                Q1.setVisible(false);
        
                Q2.setVisible(true);
                Q3.setVisible(true);
        
                
                Q2.setText("True");
                Q3.setText("False");
        
                trueFalseQuestion = true;
            }
            //Hard questions 
        } else {

            Question.setText(complexQuestions.questions[questionNumber].GetQuestion());


            String ResponseArray[]  = complexQuestions.questions[questionNumber].getAnswers().clone();

            Q1.setText(ResponseArray[0]);
            Q2.setText(ResponseArray[1]);
            Q3.setText(ResponseArray[2]);
            Q4.setText(ResponseArray[3]);



            Q1.setDisable(false);
            Q2.setDisable(false);
            Q3.setDisable(false);
            Q4.setDisable(false);

            Q1.setVisible(true);
            Q2.setVisible(true);
            Q3.setVisible(true);
            Q4.setVisible(true);


            
        } 

    }








    public void EndOfLine() {

        System.out.println("end of the line");
        

        Q1.setDisable(true);
        Q2.setDisable(true);
        Q3.setDisable(true);
        Q4.setDisable(true);

        Q1.setVisible(false);
        Q2.setVisible(false);
        Q3.setVisible(false);
        Q4.setVisible(false);

        Correct.setVisible(false);
        Incorrect.setVisible(false);

        WrongFeedback.setVisible(true);
        WrongFeedback.setText("You got " +  Integer.toString(numberCorrect) + " out of 20!");

        Question.setText("Congratulations!");


        reset.setVisible(true);
        reset.setDisable(false);


    }






    @FXML
    void resetPressed(ActionEvent event) {


    trueFalseQuestion = true;

    questionNumber = 0;

    easyQuestions = true;

    numberCorrect = 0;

    chosenAwnser = 0;
        
    WrongFeedback.setVisible(false);
    Question.setVisible(false);

    reset.setVisible(false);
    reset.setDisable(true);

    Q1.setVisible(false);
    Q2.setVisible(false);
    Q3.setVisible(false);
    Q4.setVisible(false);


    Q1.setDisable(false);
    Q3.setDisable(false);
    Q4.setDisable(false);
    Q2.setDisable(false);
    

    Correct.setVisible(false);
    Incorrect.setVisible(false);

    FeedbackButton.setDisable(true);
    FeedbackButton.setVisible(false);
    
    LearnButton.setVisible(true);
    LearnButton.setDisable(false);


    Quiz.setDisable(false);
    Quiz.setVisible(true);

    }






























    public void Incorrect() {
        System.out.println("INCORRRECTTTT");
        Correct.setVisible(false);
        Incorrect.setVisible(true);
        FeedbackButton.setText("Thats wrong :(");

        WrongFeedback.setVisible(true);


        //Replace with reason they're wrong
        WrongFeedback.setText("You're wrong :(");

        if (easyQuestions == true) {
            //This is an easy question


           // String result = "";
          //  int i = 0;
           // while (i < simpleQuestions.questions[questionNumber].explanations.length) {
           //     result = result + simpleQuestions.questions[questionNumber].explanations[i];
           //     i++;
           // }              NO idea what the propper way to do this is. I dont understand the format given. 
        

             //WrongFeedback.setText(result);


        } else {

            //This is a complex problem

        }


    }





























//NESTED JESUS'S CLASS. 

public class TestsRecycling extends RecyclableItemsArrayLists{
    
    /* [IMPORTANT!]example for using the nested classes: 
        TestsRecycling.SimpleQuestions simpleQuestions = new TestsRecycling().new SimpleQuestions();
        TestsRecycling.ComplexQuestions complexQuestions = new TestsRecycling().new ComplexQuestions();
    */
    class SimpleQuestions{
        //stores all 10 questions
        Question[] questions = new Question[10];

        //sets the simple true/false questions
        SimpleQuestions(){
            //paper
            questions[0] = new Question( getList(true, 0) + " can be recycled");
            questions[0].AddAnswer("True");
            questions[1] = new Question( getList(false, 0) + " can be recycled");
            questions[1].AddAnswer("False");

            //cardboard
            questions[2] = new Question("A clean pizza box can't be recycled");
            questions[2].AddAnswer("True");
            questions[3] = new Question("A soggy delivery box can't be recycled");
            questions[3].AddAnswer("True");
            
            //plastic
            questions[4] = new Question("Type 1 plastics can't be recycled?");
            questions[4].AddAnswer("False");
            questions[5] = new Question("Type 4 plastics can be recycled");
            questions[5].AddAnswer("False");

            //glass
            questions[6] = new Question(getList(true, 3) + " can't be recycled");
            questions[6].AddAnswer("False");
            questions[7] = new Question(getList(false, 3) + " can't be recycled");
            questions[7].AddAnswer("true");
            
            //metal
            questions[8] = new Question(getList(true, 4) + " can be recycled");
            questions[8].AddAnswer("True");
            questions[9] = new Question(getList(false, 4) + " can be recycled");
            questions[9].AddAnswer("False");

        }//end simple questions constructor

    }//end simple questions class
    
    class ComplexQuestions{
        //stores all 10 questions
        Question[] questions = new Question[10];
        //creates 10 custom items storing specific items(ex: amazon box for cardboard)
        Item[] customItems = new Item[10];
        //creates the 10 complex questions, 1 about each material & 5 general questions, each question has 4 answers
        ComplexQuestions(){
            //sets the custom items
            setCustomItems(0, 0);

            //question1
            questions[0] = new Question("Which of these can be recycled?");
            questions[0].AddAnswer(getList(false, 1), false);
            questions[0].AddAnswer(getList(false, 0), false);
            questions[0].AddAnswer(getList(false, 4), false);
            questions[0].AddAnswer("None of the above", true);

            //question2
            questions[1] = new Question("Which of these have to be thrown away?");
            questions[1].AddAnswer(customItems[8].getName(), true);
            questions[1].AddAnswer(customItems[0].getName(), false);
            questions[1].AddAnswer(customItems[1].getName(), false);
            questions[1].AddAnswer(getList(true, 3), false);

            //question3
            questions[2] = new Question("Which of these can be recycled when it's clean");
            questions[2].AddAnswer(getList(false, 2, 2), false);
            questions[2].AddAnswer(customItems[7].getName(), false);
            questions[2].AddAnswer("Pizza Boxes", true);
            questions[2].AddAnswer(getList(false, 4, 0), false);
            
            //question4
            questions[3] = new Question("A dirty napkin can be considered as: ");
            questions[3].AddAnswer(getList(false, 2), false);
            questions[3].AddAnswer(getList(true, 2), false);
            questions[3].AddAnswer(getList(true, 4), false);
            questions[3].AddAnswer(" Food-tainted paper products", true);

            //question5
            questions[4] = new Question("Which of the following can be considered non-recyclable cardboard");
            questions[4].AddAnswer(customItems[6].getName(), true);
            questions[4].AddAnswer(getList(true, 0), false);
            questions[4].AddAnswer(getList(false, 3), false);
            questions[4].AddAnswer(customItems[1].getName(), false);

            //paper
            questions[5] = new Question("Which type of paper can be recycled?");
            questions[5].AddAnswer(customItems[5].getName(), false);
            questions[5].AddAnswer(getList(false, 2), false);
            questions[5].AddAnswer(customItems[0].getName(), true);
            questions[5].AddAnswer(getList(false, 3), false);

            //cardboard
            questions[6] = new Question("Which of these cardboard materials can be recycled?");
            for (int i = 0; i < 3; i++){
                questions[6].AddAnswer(getList(true, 1, i), true);
            }//end for
            questions[6].AddAnswer("All of the above", true);
            
            //plastic
            questions[7] = new Question("What type of plastic is PVC?");
            questions[7].AddAnswer("Type 3 plastic", true);
            questions[7].AddAnswer("Type 1 plastic", false);
            questions[7].AddAnswer("Type 4 plastic", false);
            questions[7].AddAnswer("Type 6 plastic", false);

            //glass
            questions[8] = new Question("Which type of glass can NOT be recycled?");
            questions[8].AddAnswer(getList(false, 3), true);
            questions[8].AddAnswer(customItems[8].getName(), true);
            questions[8].AddAnswer(getList(false, 0), false);
            questions[8].AddAnswer(customItems[2].getName(), false);

            //metal
            questions[9] = new Question("Which of these metals can't be recycled?");
            questions[9].AddAnswer(customItems[4].getName(), false);
            questions[9].AddAnswer(getList(false, 4), true);
            questions[9].AddAnswer(getList(true, 4), false);
            questions[9].AddAnswer(customItems[9].getName(), true);
        }// end complexQuestions constructor

        //method adds 5 recyclable and 5 nonrecyclable items into an array
        public void setCustomItems( int start, int end){
            //array of strings storing all items
            String[] names = {"printing paper","clean Amazon boxes", "water bottles", "glass jam jars", "tin foil hats", " greasy napkins", "milk cartons with wax", "PVC pipes", "Shattered glass vases", "old-fashioned thermometers"};
            switch (end) {
                case 5:
                    //method stores the names of recyclable items in customItem array
                    for(int i = start; i < end; i++){
                        customItems[i] = new RecyclableItem(names[i]);
                    }//end for
                    break;
                case 10:
                    //method stores the names of nonrecyclable items in customItem array
                    for(int i = start; i < end; i++){
                        customItems[i] = new NonRecyclableItem(names[i]);
                    }//end for
                    break;
                default:
                    //method recurs for for recyclable and nonrecyclable items
                    setCustomItems(0, 5);
                    setCustomItems(5, 10);
                    break;
            }//end switch
            
        }//end setCustomItems method

    }//end complexQuestions class

    //gets a random item from the list of recyclable and nonrecyclable materials
    public String getList(boolean recyclable, int list){
        //variables
        ArrayList<ArrayList<String>> superList;
        int element;

        //gets either the recyclable list or the nonrecyclable list and stores it in a list
        if(recyclable){
            superList = GlobalRecyclingData.recyclables;
        }else{
            superList = GlobalRecyclingData.nonRecyclables;
        }//end else-if

        //randomly picks an element in the list
        element = (int)(Math.random() * superList.get(list).size());
        
        //returns the element
        return superList.get(list).get(element);
    }//end getList method

    public String getList(boolean recyclable, int list, int element){
        //variables
        ArrayList<ArrayList<String>> superList;
        
        //gets either a nonrecyclable list or recyclable list
        if(recyclable){
            superList = GlobalRecyclingData.recyclables;
        }else{
            superList = GlobalRecyclingData.nonRecyclables;
        }//end else-if

        //returns specific element from chosen list
        return superList.get(list).get(element);
    }//end getList method

}//end TestsRecycling class





}