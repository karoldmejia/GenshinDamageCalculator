import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GICalculator {
   // Declare the necessary variables for operating in the methods
   private static double atk, crit, critr, lvl, elm, multadd, multreac, multres, multtra, dmg, dmgRate, dmgtra, totAddDmg, dmgamp;
   // Declare the necessary variables for making choices
   private static int menuOpt, reacOpt, multOpt;
   private static String quantOpt;
   // Create dynamic arrays using the ArrayList class
   private static List<Double> dmgArray = new ArrayList<>(); // This array is used to accumulate all results to show the last 10 calculated elements and the highest element so far.
   /* This array is used for displaying all combo results together after calculation.
    * All elements of the array are cleared after printing the information.
    */
   private static List<Double> tempCom = new ArrayList<>();
   // Create a scanner object to obtain inputs throughout the code. Everything is declared as static for general use.
   private static Scanner txt = new Scanner(System.in);

   // Start defining the methods needed for performing the formula calculations.
   /*
    * Description: The dmgCalculus method performs calculations based on character's ATK, critical hit chance, and CRIT rate.
    * pre: The method should be called after initializing 'atk', 'crit', and 'critr' with valid numerical values.
    * post: Doesn't affect global variables.
    * @param: atk double Must be a double-type number that has been previously initialized
    * @param: crit double Must be a double-type number that has been previously initialized
    * @param: critr double Must be a double-type number that has been previously initialized
    * @return: dmg double The calculated base damage considering ATK, critical hit chance, and CRIT rate.
    */
   private static double dmgCalculus() {
       System.out.println("We'll start calculating base DMG, so please enter character's ATK, critical hit chance, and CRIT rate (in that order please)");
       atk = txt.nextDouble();
       crit = txt.nextDouble();
       critr = txt.nextDouble();
       dmg = atk * (1 + crit + critr);
       return dmg;
   }
   /*
    * Description: The ampCalculus method calculates amplified damage based on base damage (dmg), elemental mastery, and reaction multiplier.
    * pre: The method should be called after 'dmg' is correctly calculated and 'elm', 'multreac' are initialized with valid numerical values.
    * post: Results are added to arrays and doesn't affect global variables.
    * @param: dmg double Must be a double-type number that has been previously calculated
    * @param: elm double Must be a double-type number that has been previously initialized
    * @param: multreac double Must be a double-type number that has been previously initialized
    * @return: dmgamp double The calculated amplified damage considering base damage, elemental mastery, and reaction multiplier.
    */
   private static double ampCalculus() {
       System.out.println("Let's continue. Now we're calculating amplifying damage\nPlease enter elemental mastery");
       elm = txt.nextDouble();
       System.out.println("What type of reaction multiplier?\n1. Vaporize\n2. Melt");
       multOpt = txt.nextInt();
       if (multOpt==1){
           multreac = 1.5;
       } else if (multOpt==2) {
           multreac = 2;
       } else {
           System.out.println("Please insert a valid answer");
       }
       dmgamp = (dmg * (multreac * (1 + (2.79 * (elm / (elm + 1400))))));
       tempCom.add(dmgamp);
       dmgArray.add(dmgamp);
       return dmgamp;
   }
   /*
    * Description: The addCalculus method calculates additive damage based on base damage (dmg), character level, elemental mastery, additive multiplier, and enemy's resistance multiplier.
    * pre: The method should be called after 'dmg', 'lvl', 'elm', 'multadd', and 'multres' are initialized with valid numerical values.
    * post: Results are added to arrays and doesn't affect global variables.
    * @param: dmg double Must be a double-type number that has been previously calculated
    * @param: lvl double Must be a double-type number that has been previously initialized
    * @param: elm double Must be a double-type number that has been previously initialized
    * @param: multadd double Must be a double-type number that has been previously initialized
    * @param: multres double Must be a double-type number that has been randomly selected
    * @return: totAddDmg double The calculated additive damage considering base damage, level, elemental mastery, additive multiplier, and resistance multiplier.
    */
   private static double addCalculus() {
       System.out.println("Let's continue. Now we're calculating additive damage\nPlease enter character's level & elemental mastery");
       lvl = txt.nextDouble();
       elm = txt.nextDouble();
       System.out.println("What type of additive multiplier?\n1. Intensified\n2. Dendro");
       multOpt = txt.nextInt();
       if (multOpt==1){
           multadd = 1.15;
       } else if (multOpt==2) {
           multadd = 1.25;
       } else {
           System.out.println("Please insert a valid answer");
       }
       multres = ThreadLocalRandom.current().nextDouble(0.5, 2);
       System.out.println("Randomly selected enemy's resistance multiplier is: " + multres);
       dmgRate = (multadd * lvl * multres * (1 + ((5 * elm) / (elm + 1200))));
       totAddDmg = (dmg * (1 + dmgRate));
       tempCom.add(totAddDmg);
       dmgArray.add(totAddDmg);
       return totAddDmg;
   }
   /*
    * Description: The traCalculus method calculates transformative damage based on character level, elemental mastery, additive multiplier, and transformative multiplier.
    * pre: The method should be called after 'lvl', 'elm', 'multtra', and 'multres' are initialized with valid numerical values.
    * post: Results are added to arrays and doesn't affect global variables.
    * @param: dmg double Must be a double-type number that has been previously calculated
    * @param: lvl double Must be a double-type number that has been previously initialized
    * @param: elm double Must be a double-type number that has been previously initialized
    * @param: multtra double Must be a double-type number that has been previously initialized
    * @param: multres double Must be a double-type number that has been randomly selected
    * @return: dmgtra double The calculated transformative damage considering level, elemental mastery, additive multiplier, and transformative multiplier.
    */
   private static double traCalculus() {
       System.out.println("You've selected transformative damage!\nPlease enter character's level & elemental mastery");
       lvl = txt.nextDouble();
       elm = txt.nextDouble();
       System.out.println("What type of transformative multiplier?\n1. Burning\n2. Superconduct\n3. Swirl\n4. Electro-Charged\n5. Shattered\n6. Overload\n7. Bloom\n8. Burgeon\n9. Hyperbloom");
       multOpt = txt.nextInt();
       if (multOpt==1){
           multtra = 0.25;
       } else if (multOpt==2) {
           multtra = 0.5;
       } else if (multOpt==3) {
           multtra = 0.6;
       } else if (multOpt==4) {
           multtra = 1.2;
       } else if (multOpt==5) {
           multtra = 1.5;
       } else if (multOpt==6 || multOpt==7) {
           multtra = 2;
       } else if (multOpt==8 || multOpt==9) {
           multtra = 3;
       } else {
           System.out.println("Please insert a valid answer");
       }
       multres = ThreadLocalRandom.current().nextDouble(0.5, 2);
       System.out.println("Randomly selected enemy's resistance multiplier is: " + multres);
       dmgtra = (multtra * lvl * multres * (16 * (elm / (elm + 2000))));
       tempCom.add(dmgtra);
       dmgArray.add(dmgtra);
       return dmgtra;
   }
   /*
    * Description: The dmgRating method displays the latest damage results stored in the 'dmgArray' ArrayList.
    * pre: The 'dmgArray' ArrayList must contain valid numerical values.
    * post: Does not modify global variables.
    * @param: dmgArray Must be a predefined ArrayList
    * @param: max double Must be a double-type number
    * @param: i int Must be a natural number
    * @return: void
    */
   private static void dmgRating() {
       if (dmgArray.size() > 0) {
           int fiIndex = Math.max(0, dmgArray.size() - 10);
           System.out.println("These are the latest damage results:");
           for (int i = fiIndex; i < dmgArray.size(); i++) {
               System.out.println(i + ". " + dmgArray.get(i));
           }
       } else {
           System.out.println("Sorry, we don't have any information yet");

       }

   }
   /*
    * Description: The dmgHigh method finds and displays the maximum value in an ArrayList of damages.
    * pre: The 'dmgArray' ArrayList must contain valid numerical values.
    * post: Does not modify global variables.
    * @param: max double Must be a double-type number
    * @param: i int Must be a natural number
    * @param: dmgArray Must be a predefined ArrayList
    * @return: void
    */
   private static void dmgHigh() {
       if (dmgArray.size() == 0) {
           System.out.println("Sorry, we don't have any information yet");
       } else {
           double max = dmgArray.get(0);
           for (int i = 1; i < dmgArray.size(); i++) {
               if (dmgArray.get(i) > max) {
                   max = dmgArray.get(i);
               }
           }
           System.out.println("The highest recorded damage so far has been " + max);
       }
   }
   // Main method where user interacts with the calculator through a menu
   public static void main(String[] args) {
       menuOpt = 5;
       System.out.println("Welcome to your Genshin Impact Damage Calculator!");

       while (menuOpt != 0) { // We use a while loop to make the menu iterative so that the user can access options multiple times.
           System.out.println("What do you want to do now?\n1. Calculate damage\n2. Check last ten damage results\n3. Check highest damage ever calculated!\n0. Get out");
           menuOpt = txt.nextInt(); // We present the options and store the selected option in a variable.
           txt.nextLine();
           if (menuOpt == 1) { // We use conditionals to filter options
               System.out.println("Do you want to do the math for just a character or a combo?\nEnter 'ch' for character or 'com' for combo!");
               quantOpt = txt.nextLine();
               if (quantOpt.equals("ch")) {
                   System.out.println("Select reaction type, please:\n1. Amplified\n2. Additive\n3. Transformative");
                   reacOpt = txt.nextInt(); // After selecting the reaction type, the code proceeds to the corresponding option using conditionals.
                   if (reacOpt == 1) {
                       System.out.println("You've selected amplified damage!"); // Amplified damage calculation is performed using two previous methods
                       GICalculator.dmgCalculus();
                       GICalculator.ampCalculus();
                       System.out.println("Total amplified damage would be: " + dmgamp); // The result of amplified damage is printed
                       tempCom.clear(); // Clear this array

                       // The next two options follow the same pattern
                   } else if ((reacOpt == 2)) {
                       System.out.println("You've selected additive damage!");
                       GICalculator.dmgCalculus();
                       GICalculator.addCalculus();
                       System.out.println("Total additive damage would be: " + totAddDmg);
                       tempCom.clear();

                   } else if (reacOpt == 3) {
                       GICalculator.traCalculus();
                       System.out.println("Total amplified damage would be: " + dmgtra);
                       tempCom.clear();

                   } else {
                       System.out.println("Please, insert a valid option");

                   }
               } else if (quantOpt.equals("com")) {
                   System.out.println("Select reaction type, please:\n1. Amplified\n2. Additive\n3. Transformative");
                   reacOpt = txt.nextInt();
                   if (reacOpt == 1) {
                       for (int i = 0; i < 4; i++) {
                           System.out.println("You've selected amplified damage!");
                           GICalculator.dmgCalculus();
                           GICalculator.ampCalculus();
                       }
                       System.out.println("Total additive damage would be: ");
                       for (int i = 0; i < tempCom.size(); i++) {
                           System.out.println(i + ". " + tempCom.get(i));
                       }
                       tempCom.clear();

                   } else if ((reacOpt == 2)) {
                       for (int i = 0; i < 4; i++) {
                           System.out.println("You've selected additive damage!");
                           GICalculator.dmgCalculus();
                           GICalculator.addCalculus();
                       }
                       System.out.println("Total additive damage would be: ");
                       for (int i = 0; i < tempCom.size(); i++) {
                           System.out.println(i + ". " + tempCom.get(i));
                       }
                       tempCom.clear();

                   } else if (reacOpt == 3) {
                       for (int i = 0; i < 4; i++) {
                           GICalculator.traCalculus();
                       }
                       System.out.println("Total transformative damage would be: ");
                       for (int i = 0; i < tempCom.size(); i++) {
                           System.out.println(i + ". " + tempCom.get(i));
                       }
                       tempCom.clear();

                   } else {
                       System.out.println("Please, insert a valid option");

                   }
               }
           } else if (menuOpt == 2) {
               GICalculator.dmgRating(); // Display the list of the latest 10 (or fewer) calculated damages
           } else if (menuOpt == 3) {
               GICalculator.dmgHigh(); // Display the highest damage calculated so far
           } else if(menuOpt == 0){
               System.out.println("Thanks for using my calculator, bye!"); // Farewell message at the end of the code
           } else {
               System.out.println("Please, insert a valid option");
           }

       }
   }
}
