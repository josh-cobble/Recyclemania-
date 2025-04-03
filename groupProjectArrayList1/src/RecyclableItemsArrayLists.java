import java.util.*;

public class RecyclableItemsArrayLists {

    public static void main(String[] args) {
        try {
            // Create an ArrayList to store recyclable categories (paper, cardboard, etc.)
            ArrayList<ArrayList<String>> recyclables = new ArrayList<>();
            // Create an ArrayList to store non-recyclable categories (plastics, food waste, etc.)
            ArrayList<ArrayList<String>> nonRecyclables = new ArrayList<>();

            // Recyclable categories

            //
            ArrayList<String> paperRecyclables = new ArrayList<>();
            paperRecyclables.add("Newspaper");
                // These are a common and readily recyclable paper type.
            paperRecyclables.add("Magazines"); 
                // Both glossy and non-glossy magazines are recyclable.
            paperRecyclables.add("Mixed Paper");
                // Includes colored paper, junk mail, catalogs, posters, post it notes, paper wrapper, phone books and some magazines.
            paperRecyclables.add("Shredded Paper");
                // Shredded paper can be composted in your home compost pile if you have one.
            paperRecyclables.add("Envelopes");
                // Most envelopes, including those with plastic windows, are recyclable and can be placed in your curbside recycling bin

            //
            ArrayList<String> cardboardRecyclables = new ArrayList<>();
            cardboardRecyclables.add("Cardboard");
                // Cardboard is primarily made from paper pulp, which is derived from wood fibers, and can also include recycled paper fibers.
            cardboardRecyclables.add("Corrugated Cardboard");
                // Corrugated cardboard is a material made of three layers: two flat outer layers (linerboard) and a wavy, fluted middle layer, providing strength and cushioning, commonly used for shipping boxes and packaging.
            cardboardRecyclables.add("Boxboard/Paperboard");
                // Boxboard, also known as paperboard, is a material used to create packaging like folding cartons and trays, often used for products like food, cosmetics, and consumer goods.
            cardboardRecyclables.add("Pizza Boxes (Clean)");
                // Pizza boxes are made of corrugated cardboard, a material that is generally recyclable, but ensure they are empty and free of food residue or excessive grease, which can contaminate other recyclables.
            cardboardRecyclables.add("Paper Towel Rolls");
                // The empty cardboard tubes from paper towel rolls are recyclable and should be placed in your recycling bin with other cardboard.

            //
            ArrayList<String> plasticRecyclables = new ArrayList<>();
            plasticRecyclables.add("Plastic #1 (PET)");
                // This is a clear, hard plastic often used for water and soda bottles, vegetable oil containers, and some prepared food containers.
            plasticRecyclables.add("Plastic #2 (HDPE)");
                // This is a stronger, thicker plastic used for milk jugs, shampoo bottles, and detergent containers.

            //
            ArrayList<String> glassRecyclables = new ArrayList<>();
            glassRecyclables.add("Glass Bottles");
                // In Michigan, you can recycle glass bottles through curbside recycling programs or by taking them to designated drop-off recycling centers, ensuring they are clean and dry before recycling. Many communities also have a deposit system for single-serve carbonated beverage containers, with a 10-cent return for redemption at stores.
            glassRecyclables.add("Glass Jars");
                // In Michigan, you can recycle glass jars through curbside recycling programs or by taking them to designated drop-off recycling centers, ensuring they are clean and dry before recycling. Many communities also have a deposit system for single-serve carbonated beverage containers, with a 10-cent return for redemption at stores.
            glassRecyclables.add("Clear Glass Containers");
                // In Michigan, you can recycle clear glass bottles and jars, including those for food, drinks, condiments, and cosmetics, in your curbside recycling bin.
            glassRecyclables.add("Eyeglasses");
                // In Michigan, you can recycle eyeglasses through Lions Clubs, OneSight, and other organizations that collect them for reuse, including opticians and donation centers.

            //
            ArrayList<String> metalRecyclables = new ArrayList<>();
            metalRecyclables.add("Aluminum");
                // Widely recyclable, including aluminum siding, wheels, and cans.
            metalRecyclables.add("Steel");
                // This includes carbon steel, wrought iron, cast iron, and stainless steel.
            metalRecyclables.add("Copper");
                // Found in wiring, plumbing, and various industrial applications.
            metalRecyclables.add("Brass");
                // An alloy of copper and zinc, often found in hardware and fittings.
            metalRecyclables.add("Lead");
                // Lead is recyclable in Michigan, and in many other places, because it's a valuable resource that can be reused indefinitely without losing quality, and recycling reduces the environmental impact of mining and the amount of toxic waste produced.

            // Add all categories of recyclable items into the recyclables ArrayList
            recyclables.add(paperRecyclables);
            recyclables.add(cardboardRecyclables);
            recyclables.add(plasticRecyclables);
            recyclables.add(glassRecyclables);
            recyclables.add(metalRecyclables);

            // Non-recyclable categories

            // Non-recyclable Paper
            ArrayList<String> nonRecyclablePaper = new ArrayList<>();
            nonRecyclablePaper.add("Food-tainted paper products (paper plates, towels, napkins)");
                // Food-tainted paper products are generally not recyclable because the food residue, especially grease or oil, contaminates the paper fibers, making them difficult to process and potentially ruining the entire batch of recyclables.
            nonRecyclablePaper.add("NCR paper");
                // NCR (No Carbon Required) paper is generally not recyclable because of the chemicals and coatings used to create the carbonless copy effect, which can contaminate the recycling process.
            nonRecyclablePaper.add("Laminated paper");
                // Laminated paper is generally not recyclable because the plastic layer bonded to the paper makes it difficult to separate and recycle both materials, potentially contaminating the recycling process.
            
            // Non-recyclable Cardboard
            ArrayList<String> nonRecyclableCardboard = new ArrayList<>();
            nonRecyclableCardboard.add("Contaminated cardboard");
                // Contaminated cardboard, such as that with grease, food residue, or excessive moisture, cannot be recycled because the contaminants can interfere with the recycling process and contaminate other materials, leading to lower quality recycled products and increased costs.
            nonRecyclableCardboard.add("Waxed cardboard");
                // Waxed cardboard is generally not recyclable because the wax coating, often made of plastic, contaminates the recycling process and makes it difficult to separate the paper fibers for reuse.
            nonRecyclableCardboard.add("Laminated cardboard");
                // Laminated cardboard is often difficult to recycle because the plastic layer, which is used for lamination, is not easily separated from the paper and can contaminate the recycling process, making it difficult to recycle both materials.

            // Non-recyclable Plastics
            ArrayList<String> nonRecyclablePlastics = new ArrayList<>();
            nonRecyclablePlastics.add("Plastic #3 (PVC)");
                // Polyvinyl chloride, used in cling film, some food packaging, and toys, is generally not recycled due to the toxic materials released during recycling.
            nonRecyclablePlastics.add("Plastic #4 (LDPE)");
                // Low-density polyethylene, found in plastic bags and flexible packaging, is often not accepted in curbside recycling programs.
            nonRecyclablePlastics.add("Plastic #5 (PP)");
                // Polypropylene, used for some food containers and lids, is sometimes recycled, but not universally.
            nonRecyclablePlastics.add("Plastic #6 (PS)");
                // Polystyrene, including Styrofoam, is not widely recycled, although some specialized facilities may accept clean, sterile Expanded Polystyrene (EPS).
            nonRecyclablePlastics.add("Plastic #7 (Other)");
                // This category encompasses a variety of plastics, including polycarbonate and bioplastics, and is generally not recycled due to the mixed nature of the materials.

            // Non-recyclable Glass
            ArrayList<String> nonRecyclableGlass = new ArrayList<>();
            nonRecyclableGlass.add("Pyrex");
                // Pyrex is a brand of heat-resistant glassware and cookware, initially made from borosilicate glass, known for its ability to withstand rapid temperature changes and is now also made with tempered soda-lime glass.
            nonRecyclableGlass.add("Oven-safe dishes");
                // Oven-safe dishes are typically made from materials like tempered glass (Pyrex or Corningware).
            nonRecyclableGlass.add("Plates");
                // Non-recyclable plates are typically made of ceramic glass or borosilicate glass, which are designed to withstand high temperatures and contain additives that make them incompatible with standard glass recycling processes.
            nonRecyclableGlass.add("Mirrored glass");
                // Mirror glass, which is non-recyclable, is typically made of a standard glass base coated with a metallic layer, which makes it incompatible with the standard glass recycling process.
            nonRecyclableGlass.add("Glass windows");
                // Non-recyclable glass windows, mirrors, and related products are typically made of heat-treated or tempered glass, borosilicate glass, laminated glass, or glass with coatings or additives that make them incompatible with standard glass recycling processes.
            nonRecyclableGlass.add("Light bulbs");
                // Non-recyclable light bulbs, like incandescent and halogen bulbs, are typically made of heat-resistant glass or quartz glass which can't be recycled with standard glass due to their different melting points and potential contaminants.
            nonRecyclableGlass.add("Ceramics");
                // Non-recyclable ceramics, often found in items like plates, mugs, and ovenware, are typically made of glass-ceramics, which are heat-resistant and contain additives that prevent them from melting at the same temperatures as regular glass.
            nonRecyclableGlass.add("Frosted glass");
                // Frosted glass, typically created through acid etching or sandblasting, is generally not recyclable because the chemical treatments or abrasives used to create the frosted surface can contaminate the glass, making it unsuitable for standard recycling processes.
            nonRecyclableGlass.add("Broken glass (carefully wrapped for disposal)");
                // Broken glass is often not recyclable in standard recycling programs because it can contaminate other recyclables, injure workers, and damage recycling machinery.

            // Non-recyclable Metals
            ArrayList<String> nonRecyclableMetals = new ArrayList<>();
            nonRecyclableMetals.add("Uranium");
                // Uranium recycling is not currently viable in Michigan, or the United States, due to a combination of economic and political factors, including low uranium prices, high recycling costs, and concerns about nuclear proliferation.
            nonRecyclableMetals.add("Plutonium");
                // Plutonium recycling is not currently practiced in Michigan, or the United States, due to a combination of factors including concerns about nuclear proliferation, the high cost of reprocessing, and the lack of a readily available infrastructure for recycling.
            nonRecyclableMetals.add("Radon");
                // Radon cannot be recycled because it's a naturally occurring radioactive gas that decays into other substances, and there's no practical or economical way to capture and reuse it.
            nonRecyclableMetals.add("Mercury");
                // While mercury can be recycled, in Michigan and elsewhere, it's treated as hazardous waste due to its toxicity and potential environmental harm, so it's not typically recycled through standard curbside programs, but through specialized programs like Clean Sweep and household hazardous waste collection centers.

            // Add non-recyclable categories to the nonRecyclables ArrayList
            nonRecyclables.add(nonRecyclablePaper);
            nonRecyclables.add(nonRecyclableCardboard);
            nonRecyclables.add(nonRecyclablePlastics);
            nonRecyclables.add(nonRecyclableGlass);
            nonRecyclables.add(nonRecyclableMetals);

            // Print all recyclable and non-recyclable items by category
            System.out.println("Recyclable Items:");
            printCategories(recyclables);
            System.out.println("\nNon-Recyclable Items:");
            printCategories(nonRecyclables);

            // Test the isRecyclable method with a few example items
            System.out.println("\nIs 'Glass Bottles' recyclable? " + isRecyclable("Glass Bottles", recyclables));
            System.out.println("Is 'Pizza Boxes' recyclable? " + isRecyclable("Pizza Boxes", recyclables));
            System.out.println("Is 'Plastic #3 (PVC)' recyclable? " + isRecyclable("Plastic #3 (PVC)", recyclables));

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // The method to print all items in each category (recyclables or non-recyclables)
    public static void printCategories(ArrayList<ArrayList<String>> categories) {
        for (ArrayList<String> category : categories) {
            System.out.println(category);
        }
    }

    // The method to check if an item is recyclable when presented with an item
    public static boolean isRecyclable(String item, ArrayList<ArrayList<String>> recyclables) {
        // Iterate over each category in recyclables
        for (ArrayList<String> category : recyclables) {
            if (category.contains(item)) {
                return true; // An item was found in a recyclable category
            }
        }
        return false; // Item was not found in any recyclable category
    }
}
