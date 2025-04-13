import java.util.*;
public class TestsRecycling extends RecyclableItemsArrayLists{
    Question[] questions = new Question[10];
    /* [IMPORTANT!]example for using the nested classes: 
        TestsRecycling.SimpleQuestions simpleQuestions = new TestsRecycling().new SimpleQuestions();
        TestsRecycling.ComplexQuestions complexQuestions = new TestsRecycling().new ComplexQuestions();
    */
    
    class SimpleQuestions{
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