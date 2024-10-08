public class Main {

   public static void main(String []args) {
      
      // TIP: Try running this in the Java Visualizer at pythontutor.com
		
		System.out.println("🎟️  Welcome to the Java Adventure Park 🎟️"); 
		
		int age = 16; // test different values!
		double height = 5.5; // in feet, test different values
		
		if (age >= 18) {
			if (height >= 5.0) {
				System.out.println("🎢 You can ride all the rides!");
			} 
			else {
				System.out.println("Sorry, you are old enough but not tall enough for all the rides.");
			}
		} 
		
		else if (age >= 12) {
			if (height >= 4.5) {
				System.out.println("🎡 You can ride the junior rides!");
			} 
			else {					
				System.out.println("Sorry, you are old enough but not tall enough for the junior rides.");
			}
		}
		
		else if (age >= 7 && height >= 3.0) {
			System.out.println("🎠 You can ride the kids' rides!");
		} 
		
		else {
			System.out.println("Sorry, you cannot ride anything here. And your ticket is nonrefundable...");
		}

      
   }
}
