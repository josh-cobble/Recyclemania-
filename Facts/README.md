How Facts.java works:

public static final List<String> recyclablePaperFacts = Arrays.asList() contains several fun facts about recyclable paper.

There are several other arraylists that also tell fun facts about a certain type of item. There are arraylists for both
recyclable and nonrecyclable items, which are all under public static class RecyclableFacts. 

Using the arraylist below, all of the above arraylists have been placed into the one below as elements.
public static final List<String> allFacts = new ArrayList<>();
static

The map below maps fun facts to questions (questions are from TestsRecycling.java).
private Map<Question, String> questionsFactsMap = new HashMap<>();

The method below is used to get the map, questionsFactsMap.
public Map<Question, String> getFactsMap() {
    return questionsFactsMap;
}

The method below is the same for both SimpleQuestions and ComplexQuestions (from TestsRecycling.java).
It uses a new list to shuffle question order and attach a random fact to a question.

public class FactsForSimpleQuestions extends SimpleQuestions {
    FactsForSimpleQuestions() {
        super();
        Random rand = new Random();
        
        List<Question> randomizeQuestionOrder = new ArrayList<>(Arrays.asList(questions));
        Collections.shuffle(randomizeQuestionOrder);

        for (Question q : randomizeQuestionOrder) {
            String randomFact = allFacts.get(rand.nextInt(allFacts.size()));
            questionsFactsMap.put(q, randomFact);
    }

}
}

