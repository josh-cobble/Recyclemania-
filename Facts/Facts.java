import java.util.*;

public class Facts extends TestsRecycling {


//Recyclable Facts

public static class RecyclableFacts {

public static final List<String> recyclablePaperFacts = Arrays.asList(
"Newspapers are made of paper, which can typically be recycled into new paper products.",
"The recycling process can separate the glossy coatings and other materials used in making magazines, making them safe to recycle.",
"As long as the paper is clean, mixed paper is recyclable since paper is made from wood fibers.",
"Shredded paper is paper, so it is recyclable. Just make sure to bag up the pieces so they don't get lost or cause problems with the recycling process.",
"Even if an envelope contains a small plastic window on it, this is usually filtered out during the recycling process."
);

public static final List<String> recyclableCardboardFacts = Arrays.asList(
"Corrugated and grey paperboard are the 2 most commonly used cardboards, and these, as well as several other cardboard types, are made of paper, which is recyclable.",
"Not only is corrugated cardboard biodegradable, but it is also recyclable.",
"In the European Union, over 84% of corrugated cardboard is recycled yearly. Boxboard/paperboard is made of paper, so it is recyclable.",
"Since Pizza boxes are made of cardboard, which is made of paper, they are recyclable.",
"Since paper Towel rolls are usually made from recycled materials, they are recyclable."
);

public static final List<String> recyclablePlasticFacts = Arrays.asList(
"Plastic #1, or PET, is one of the most commonly recycled plastics. It can be recycled because of its stable chemical structure.",
"Plastic #2, or HDPE, is recyclable because it's easy to make it into new products and recycle it multiple times.",
);

public static final List<String> recyclableGlassFacts = Arrays.asList(
"Glass can be recycled repeatedly without losing its quality, so glass bottles are a good candidate for recycling.",
"Since glass jars are made from natural resources, they are recyclable.",
"As long as a glass container is free of contaminants, and without its lid, it can be recycled since glass is made from natural resources.",
"As long as eyeglass frames are separated from their lenses, they can be recycled. The best way to 'recycle' eyeglasses is to give them to the homeless or someone who needs them."
);

public static final List<String> recyclableMetalFacts = Arrays.asList(
"Aluminum can be recycled endlessly without losing quality. It can be recycled into cans, wires, car parts, building materials, and more.",
"Since steel is made of metals and most metals can be recycled continuously without losing quality, steel is recyclable.",
"Recycled copper can retain up to 95% of its quality when it was new. It is a metal, and thus, recyclable.",
"Brass is a metal, which makes it recyclable. Its recyclability contributes to a conservation of energy and reduces carbon emissions.",
"99% of lead batteries in the U.S. are recycled. Lead is a metal, so it is recyclable."
);


//Nonrecyclable Facts

public static final List<String> nonRecyclablePaperFacts = Arrays.asList(
"Food or grease on a paper product, such as paper plates, towels, or napkins, can contaminate or get stuck in recycling machinery.",
"Chemicals or coatings used on NCR paper can contaminate other recyclables.",
"It is difficult for the plastic layer on laminated paper to be removed while it is being recycled. Therefore, it should not be recycled."
);

public static final List<String> nonRecyclableCardboardFacts = Arrays.asList(
"Because contaminated cardboard can be greasy, oily, or contain pieces of food, this can be hard for recycling machines to process.",
"The wax coating on waxed cardboard stops recycling machines from breaking down the cardboard's paper fibers. So, it should not be recycled.",
"Because it contains a plastic layer, laminated cardboard is not recyclable. It is difficult for recycling machines to remove plastic from cardboard."
);

public static final List<String> nonRecyclablePlasticsFacts = Arrays.asList(
"When Plastic #3, or PVC, can release harmful chemicals when melted down in the recycling process.",
"Plastic #4, or LDPE, is typically used to make products like grocery bags. These bags can get stuck in recycling machinery.",
"Many products made with Plastic #5, or PP, also contain Plastic #1, or PET, which is not recyclable.",
"Plastic #6, or PS, which is typically used to make styrofoam or Solo cups, is expensive to recycle and is difficult to recycle since it is very lightweight.",
"Products made with Plastic #7, or Other, are typically made of many different types of plastics. Since most plastics cannot be recycled, Plastic #7 is not a good candidate for recycling."
);

public static final List<String> nonRecyclableGlassFacts = Arrays.asList(
"Pyrex can be made from materials that are not recyclable. It can also contaminate other recyclables because it is hard for the recycling process to tell the difference between it and regular glass.",
"Oven-safe dishes may be made from multiple types of glass that have different melting points. This will cause the recycling process to become contaminated.",
"Since glass plates are often made from multiple types of glass, they can contaminate the recycling process. If a piece of the plate shatters, it can damage recycling equipment and harm workers.",
"Mirrors have a reflective coating that can contaminate the recycling process.",
"Glass windows typically have a coating that makes them hard to melt during the recycling process.",
"Some lightbulbs contain hazardous material, such as mercury, and therefore, should not be recycled. Lightbulbs also have a lot of materials, which can be difficult for recycling machines to separate.",
"It is difficult to melt ceramics and they are highly durable.",
"Frosted glass has a coating and may have been made using chemicals. Both of these are contaminations to other recyclables.",
"Even if broken glass is wrapped up, it may contain pieces of glass that are hard to tell apart. Some of them may be recyclable while others may not be. Broken glass can also be a safety hazard to recycling workers and equipment."
);

public static final List<String> nonRecyclableMetalsFacts = Arrays.asList(
"The U.S. does not recycle uranium because recycling it is expensive and because of fears of other countries having access to it (for uranium to be reused, it may have to be transported through other countries) and making nuclear weapons.",
"The U.S. does not recycle plutonium because this is expensive and because transporting it can be dangerous.",
"Radon is not naturally occuring. It comes from radioactive decay, so it can be dangerous to people.",
"Mercury is very toxic and a mercury spill can be very dangerous to people. It is also difficult to remove from certain products. So, it should not be recycled."
);

public static final List<String> customItemsFacts = Arrays.asList(
"Printing paper can be recycled since ink can be removed during the recycling process. Paper is recyclable.",
"A clean Amazon box can be recycled as long as any plastics and tapes are removed. Since Amazon boxes are made of cardboard, they are recyclable.",
"Water bottles are typically made of PET or HDPE plastics, which are recyclable.",
"Glass jam jars are recyclable since they are made from natural resources.",
"Tin foil hats can be recycled since they are made of aluminum, which can be recycled without losing quality.",
"Greasy napkins cannot be recycled since the grease can contaminate other recyclables.",
"Milk cartons are made of paper, so they are recyclable.",
"PVC Pipes can be recycled, but it needs special equipment to recycle it.",
"Shattered glass vases can harm people or recycling machinery. It is also difficult for recycling machines to process.",
"Since old fashioned thermometers contain mercury, which can be toxic, they are not recyclable."
);

}


//All facts in one list

public static final List<String> allFacts = new ArrayList<>();
static {
    allFacts.addAll(RecyclableFacts.recyclablePaperFacts);
    allFacts.addAll(RecyclableFacts.recyclableCardboardFacts);
    allFacts.addAll(RecyclableFacts.recyclablePlasticFacts);
    allFacts.addAll(RecyclableFacts.recyclableGlassFacts);
    allFacts.addAll(RecyclableFacts.recyclableMetalFacts);
    allFacts.addAll(RecyclableFacts.nonRecyclablePaperFacts);
    allFacts.addAll(RecyclableFacts.nonRecyclableCardboardFacts);
    allFacts.addAll(RecyclableFacts.nonRecyclablePlasticsFacts);
    allFacts.addAll(RecyclableFacts.nonRecyclableGlassFacts);
    allFacts.addAll(RecyclableFacts.nonRecyclableMetalsFacts);
    allFacts.addAll(RecyclableFacts.customItemsFacts);
}


//Mapping Facts to Questions

private Map<Question, String> questionsFactsMap = new HashMap<>();

public Map<Question, String> getFactsMap() {
    return questionsFactsMap;
}

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

public class FactsForComplexQuestions extends ComplexQuestions {
    FactsForComplexQuestions() {
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

}
