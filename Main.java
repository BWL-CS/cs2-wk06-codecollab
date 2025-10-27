public class Main {

    public static void main(String[] args) {

		System.out.println("\n 🪄✨ Welcome to the Great Wizarding Cook-Off competition! 🪄✨ \n");

        // ==============================
        // SECTION 1: VARIABLES
        // ==============================

		System.out.println("\n *** SECTION 1: Variables *** \n");

        // Creating variables (long way) - what are the vocab terms for these 2 lines?
        int cauldronHeat;
        cauldronHeat = 72;

        // Creating variables (short way)
		// what is the vocab term for this way?
        String chefName = "Sorcerer Basilisk";
        double tasteScore = 0.75; // 75% approval from judges
        boolean dishIsSafe = true; // has not melted through table

        // Combine Strings - what's the vocab term for this?
        String intro = "Chef " + chefName + " enters the arena.";
        System.out.println(intro);

        // print() vs println() - how do these methods work?
        System.out.print("Summoning ");
        System.out.println("ancient spices.");
        System.out.print("Chanting>");
        System.out.println(" simmer");

        // ==============================
        // SECTION 2: ARITHMETIC 
        // ==============================

		System.out.println("\n *** SECTION 2: Arithmetic *** \n");

        // Basic arithmetic
		int servings = 7;
		int numIngredients = 4 * servings;
        System.out.println("Number of ingredients prepared: " + numIngredients);

		// Explain the output?
        System.out.println(4 + "7"); 

		// Explain the expression?
		double scoreMath = 2 + (3 * 2 - 6);
        System.out.println(scoreMath);

        // Odd ID means chaotic ingredient. Even ID means stable.
        int ingredientID = 23;

        int remainder = ingredientID % 2;
        System.out.println(remainder); // 1 means chaotic

		ingredientID = 628; // check another ingredient
        System.out.println(ingredientID % 2); // 0 means stable


        // ==============================
        // SECTION 3: COPYING VALUES
        // ==============================

		System.out.println("\n *** SECTION 3: Copying Values *** \n");

        int dragonPepperHeat = 16;
        int backupPepperHeat = dragonPepperHeat;
		System.out.println("Backup pepper heat: " + backupPepperHeat);

        int x = 15;
        int y = 21;
        int z = 2;
        x = y;        // x is now ?
        y = y * 2;    // y is now ?
        z = 27;       
        System.out.println("X is " + x);
        System.out.println("Y is " + y);
        System.out.println("Z is " + z);


        // ==============================
        // SECTION 4: TYPE MISMATCH & CASTING
        // ==============================

		System.out.println("\n *** SECTION 4: Type Mismatch & Casting *** \n");

        // Why use doubles here?
        double potionTemp = 3;        
        double boilRate = 3.14;       
        potionTemp = 2 * boilRate;
        System.out.println("Your potion must be at a temperature of " + potionTemp);

        // Increment and decrement
        int famePoints = 0;
        famePoints = famePoints + 1;  // crowd cheers
        famePoints = famePoints - 15; // judge boos
        System.out.println(famePoints);

        // Casting
        int runeCount = 5;
        double runeAsDouble = (double) runeCount;
        System.out.println("Rune count (double): " + runeAsDouble);

        int runeBackToInt = (int) runeAsDouble;
        System.out.println("Rune count (int): " + runeBackToInt);

        // Division review - explain the output?
        System.out.println(3 / 4);         
        System.out.println(3.0 / 4);       
        System.out.println(3 / 4.0);      
        System.out.println((double) 3 / 4); 
        System.out.println((int) 3.0 / 4); 

        // Casting to avoid ???
        int workingSpells = 13;
        int totalSpells = 40;
        double successRate = (double) workingSpells / totalSpells;
        System.out.println("Spell success rate: " + successRate); 

        // Manual rounding - how does this work?
        double goodSaucePH = 100.55;
        double cursedSaucePH = -273.15;
        int roundGood = (int) (goodSaucePH + 0.5);
        int roundCursed = (int) (cursedSaucePH - 0.5); 
        System.out.println("Rounded good sauce pH: " + roundGood);
        System.out.println("Rounded cursed sauce pH: " + roundCursed);


        // ==============================
        // SECTION 5: COMPOUND OPERATORS
        // ==============================

		System.out.println("\n *** SECTION 5: Compound Operators *** \n");

        int goldCoins = 0;
        goldCoins = goldCoins + 1;
        goldCoins += 1;
        System.out.println("Coins: " + goldCoins);

        goldCoins++; // tip from audience
        goldCoins--; // tax from guild

        goldCoins = goldCoins * 2;
        goldCoins *= 3;
        System.out.println("Coins now: " + goldCoins);

        goldCoins *= -10; // gambling loss
        goldCoins /= 10;
        goldCoins %= 7;
        System.out.println("Coins after chaos: " + goldCoins);


        // ==============================
        // SECTION 6: MATH CLASS
        // ==============================

        System.out.println("\n *** SECTION 6: Math Class Methods *** \n");

        // abs
        int spiceDrift = Math.abs(-35);
        System.out.println(spiceDrift);

        System.out.println(Math.abs(-388.55));

        double burnFactor = Math.abs(-79.73);
        System.out.println(burnFactor);

        // pow
        // FlavorIntensity = base^2
        double baseFlavor = 3;
        double flavorIntensity = Math.pow(baseFlavor, 2);
        System.out.println(flavorIntensity);

        // sqrt
        // AromaSpread = sqrt(magicDistanceUnits)
        double scentField = 99.0;
        double aromaSpread = Math.sqrt(scentField);
        System.out.println(aromaSpread);

        // Math.random() in [0.0, 1.0)
        double rawRandom = Math.random();
        System.out.println(rawRandom);

        // Scale 0-100
        double judgeMood = Math.random() * 100;
        System.out.println(judgeMood);

        // Shift start by +1
        double chaosRating = Math.random() + 1;
        System.out.println(chaosRating);

        // General range:
        // (int)(Math.random() * max) + min
        // Example: produce random ingredient rarity 10..29
        int rarityScore = (int) (Math.random() * 20) + 10;
        System.out.println("Ingredient rarity: " + rarityScore);


        // ==============================
        // SECTION 7: STRING METHODS
        // ==============================

		System.out.println("\n *** SECTION 7: String Class Methods *** \n");

        // Two ways to create Strings
        String dishName1 = new String("Eldritch Stew");
        String dishName2 = "Celestial Souffle";

        // length() method
        int len1 = dishName1.length();
        int len2 = dishName2.length();
        System.out.println("Len1: " + len1);
        System.out.println("Len2: " + len2);

        // substring() method
        String announcerLine = "ROUND TWO: CHAOS DESSERT";

        String firstPart = announcerLine.substring(0, 9); // "ROUND TWO"
        System.out.println(firstPart);

        String restPart = announcerLine.substring(10); // "CHAOS DESSERT"
        System.out.println(restPart);

        // indexOf() method
        String comment1 = "Texture is stable";
        String comment2 = "Texture is NOT stable";

        int idxNot1 = comment1.indexOf("NOT"); 
        int idxNot2 = comment2.indexOf("NOT"); 
        System.out.println("Index in comment1: " + idxNot1);
        System.out.println("Index in comment2: " + idxNot2);

        // equals() method
        boolean sameComment = comment1.equals(comment2);
        System.out.println("Same review? " + sameComment);

        sameComment = comment2.equals(comment1);
        System.out.println(sameComment);

        sameComment = comment1.equals("Texture is stable");
        System.out.println(sameComment); 

        // compareTo() method
        // HINT: Positive means calling String comes after other String
        System.out.println(comment1.compareTo("Z"));
        System.out.println(comment1.compareTo("A"));

        // What are we checking here??
        int dishOrder = dishName1.compareTo(dishName2);
        System.out.println("Dish sort order check: " + dishOrder);

    }
}
