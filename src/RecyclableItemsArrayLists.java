import java.util.*;

// 
class GlobalRecyclingData {
    public static ArrayList<ArrayList<String>> recyclables = new ArrayList<>();
    public static ArrayList<ArrayList<String>> nonRecyclables = new ArrayList<>();
}

abstract class Item {
    String name;

    public Item(String name) {
        this.name = name;
    }

    // Abstract method to determine if the item is recyclable
    public abstract boolean isRecyclable();

    public String getName() {
        return name;
    }
}

class RecyclableItem extends Item {
    public RecyclableItem(String name) {
        super(name);
    }

    @Override
    public boolean isRecyclable() {
        return true;
    }
}

class NonRecyclableItem extends Item {
    public NonRecyclableItem(String name) {
        super(name);
    }

    @Override
    public boolean isRecyclable() {
        return false;
    }
}

public class RecyclableItemsArrayLists {

    public RecyclableItemsArrayLists() {
        initializeData();
        displayResults();
    }

    private void initializeData() {
        // Recyclables catigories
        ArrayList<String> paperRecyclables = new ArrayList<>(Arrays.asList("Newspaper", "Magazines", "Mixed Paper", "Shredded Paper", "Envelopes"));
        ArrayList<String> cardboardRecyclables = new ArrayList<>(Arrays.asList("Cardboard", "Corrugated Cardboard", "Boxboard/Paperboard", "Pizza Boxes (Clean)", "Paper Towel Rolls"));
        ArrayList<String> plasticRecyclables = new ArrayList<>(Arrays.asList("Plastic #1 (PET)", "Plastic #2 (HDPE)"));
        ArrayList<String> glassRecyclables = new ArrayList<>(Arrays.asList("Glass Bottles", "Glass Jars", "Clear Glass Containers", "Eyeglasses"));
        ArrayList<String> metalRecyclables = new ArrayList<>(Arrays.asList("Aluminum", "Steel", "Copper", "Brass", "Lead"));
        GlobalRecyclingData.recyclables.addAll(Arrays.asList(paperRecyclables, cardboardRecyclables, plasticRecyclables, glassRecyclables, metalRecyclables));

        // Non-recyclables catigories
        ArrayList<String> nonRecyclablePaper = new ArrayList<>(Arrays.asList("Food-tainted paper products (paper plates, towels, napkins)", "NCR paper", "Laminated paper"));
        ArrayList<String> nonRecyclableCardboard = new ArrayList<>(Arrays.asList("Contaminated cardboard", "Waxed cardboard", "Laminated cardboard"));
        ArrayList<String> nonRecyclablePlastics = new ArrayList<>(Arrays.asList("Plastic #3 (PVC)", "Plastic #4 (LDPE)", "Plastic #5 (PP)", "Plastic #6 (PS)", "Plastic #7 (Other)"));
        ArrayList<String> nonRecyclableGlass = new ArrayList<>(Arrays.asList("Pyrex", "Oven-safe dishes", "Plates", "Mirrored glass", "Glass windows", "Light bulbs", "Ceramics", "Frosted glass", "Broken glass (carefully wrapped for disposal)"));
        ArrayList<String> nonRecyclableMetals = new ArrayList<>(Arrays.asList("Uranium", "Plutonium", "Radon", "Mercury"));
        GlobalRecyclingData.nonRecyclables.addAll(Arrays.asList(nonRecyclablePaper, nonRecyclableCardboard, nonRecyclablePlastics, nonRecyclableGlass, nonRecyclableMetals));
    }

    private void displayResults() {
        System.out.println("Recyclable Items:");
        printCategories(GlobalRecyclingData.recyclables);

        System.out.println("\nNon-Recyclable Items:");
        printCategories(GlobalRecyclingData.nonRecyclables);

        System.out.println("\nIs 'Glass Bottles' recyclable? " + isRecyclable("Glass Bottles"));
        System.out.println("Is 'Pizza Boxes' recyclable? " + isRecyclable("Pizza Boxes"));
        System.out.println("Is 'Plastic #3 (PVC)' recyclable? " + isRecyclable("Plastic #3 (PVC)"));
    }

    private void printCategories(ArrayList<ArrayList<String>> categories) {
        for (ArrayList<String> category : categories) {
            System.out.println(category);
        }
    }

    private boolean isRecyclable(String item) {
        for (ArrayList<String> category : GlobalRecyclingData.recyclables) {
            if (category.contains(item)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new RecyclableItemsArrayLists();
    }
}
