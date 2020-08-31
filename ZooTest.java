import java.util.Scanner;

public class ZooTest {
    /* SETUP ANIMALS */
    static Animal[] setupAnimals(){
        Animal[] animals = new Animal[6];
        animals[0] = new Wolf("Akela", "male", true, true);
        animals[1] = new Falcon("Millenium", "male", "North America", false);
        animals[2] = new Turtle("Crush", "Male", true, true);
        animals[3] = new Lion("Nala", "female", false, true);
        animals[4] = new Penguin("Kowalski", "male", false, true);
        animals[5] = new Alligator("Swampy", "female", true, "13.6");

        printSummary(animals);
        System.out.println();
        printVerboseList(animals);

        return animals;
    }

    /* ADD ANIMAL */
    static Animal[] addAnimal(Animal newAnimal, Animal[] animals){
        Animal[] newAnimals = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; i++){
            newAnimals[i] = animals[i];
        }
        newAnimals[animals.length] = newAnimal;

        printSummary(newAnimals);
        return newAnimals;
    }

    /* DELETE ANIMAL */
    static Animal[] deleteAnimal(String name, Animal[] animals){
        Animal[] newAnimals = new Animal[animals.length - 1];
        for (int i = 0, j = 0; i < animals.length; i++){
            if (animals[i].getUniqueName().compareTo(name) != 0) {
                newAnimals[j] = animals[i];
                j++;
            }
        }

        printSummary(newAnimals);
        return newAnimals;
    }

    /* PRINT SUMMARY */
    static void printSummary(Animal[] animals) {
        int numAlligator = 0, numFalcon = 0, numLion = 0, numPenguin = 0, numTurtle = 0, numWolf = 0;
        int numTotal = 0;

        for (int i = 0; i < animals.length; i++){
            if (animals[i].getAnimalType().compareTo("wolf") == 0)
                numWolf++;
            else if (animals[i].getAnimalType().compareTo("lion") == 0)
                numLion++;
            else if(animals[i].getAnimalType().compareTo("falcon") == 0)
                numFalcon++;
            else if(animals[i].getAnimalType().compareTo("penguin") == 0)
                numPenguin++;
            else if(animals[i].getAnimalType().compareTo("turtle") == 0)
                numTurtle++;
            else if(animals[i].getAnimalType().compareTo("alligator") == 0)
                numAlligator++;
                
            numTotal++;
        }

        System.out.println("\nSummary");
        System.out.println("There are " + numTotal + " animals in the zoo.");
        
        if (numWolf > 0)
            System.out.println(numWolf + " Wolf(ves)");
        if (numLion > 0) 
            System.out.println(numLion + " Lion(s)");
        if (numFalcon > 0) 
            System.out.println(numFalcon + " Falcon(s)");
        if (numPenguin > 0) 
            System.out.println(numPenguin + " Penguin(s)");
        if (numTurtle > 0) 
            System.out.println(numTurtle + " Turtle(s)");
        if (numAlligator > 0) 
            System.out.println(numAlligator + " Alligator(s)");
    }

    /* PRINT VERBOSE LIST */
    static void printVerboseList(Animal[] animals){
        System.out.println("Verbose List of Animals with details:");
        System.out.println("   Name       Species");

        for (int i = 0; i < animals.length; i++){
            System.out.printf("%d: %-10s %-10s\n", i+1, animals[i].getUniqueName(), animals[i].getAnimalType());
        }
    }

    /* DISPLAY SPECIFIC INFO */
    static void displayInfo(Animal[] animals, String name){
        for (int i = 0; i < animals.length; i++){
            if (name.compareTo(animals[i].getUniqueName()) == 0){
                animals[i].displaySpecialInfo();
            }
        }
    }

    /* PRINT OPTIONS */
    static void printOptions(){
        System.out.println();
        System.out.println("Options:");
        System.out.println("Add animal (add)");
        System.out.println("Delete animal (delete)");
        System.out.println("Display animal (display)");
        System.out.println();
    }

    public static void main (String[] args){
        System.out.println("Type exit at any time to end the program.");

        Animal[] animals = setupAnimals();
        Scanner myScanner = new Scanner(System.in);
        String temp;

        while (true){
            printOptions();
            String option = myScanner.nextLine();

            /* add functionality */
            if (option.compareTo("add") == 0){
				System.out.println("\nYou can add a wolf, lion, falcon, penguin, turtle, or alligator");
                
                System.out.println();
                System.out.println("Animal type: ");
                String animalType = myScanner.nextLine();
                System.out.println("Animal name: ");
                String name = myScanner.nextLine();
                System.out.println("Animal gender: ");
                String gender = myScanner.nextLine();
                System.out.println();

                /* adding a wolf */
                if (animalType.compareTo("wolf") == 0){
                    boolean canHowl = false;
                    boolean isInPack = false;

                    System.out.println("Can " + name + " howl? (y/n)");
                    temp = myScanner.nextLine();
                    if (temp.compareTo("y") == 0)
                        canHowl = true;

                    System.out.println("Is " + name + " in pack? (y/n)");
                    temp = myScanner.nextLine();
                    if (temp.compareTo("y") == 0)
                        isInPack = true;

                    Animal newAnimal = new Wolf(name, gender, canHowl, isInPack);
                    animals = addAnimal(newAnimal, animals);
                }

                /* adding a lion */
				else if (animalType.compareTo("lion") == 0){
                    boolean hasCubs = false;
                    boolean isNapping = false;

                    System.out.println("Does " + name + " have cubs? (y/n)");
                    temp = myScanner.nextLine();
                    if (temp.compareTo("y") == 0)
                        hasCubs = true;

                    System.out.println("Is " + name + " napping? (y/n)");
                    temp = myScanner.nextLine();
                    if (temp.compareTo("y") == 0)
                        isNapping = true;

					Animal newAnimal = new Lion(name, gender, hasCubs, isNapping);
					animals = addAnimal(newAnimal, animals);
				}

                /* adding a falcon */
				else if(animalType.compareTo("falcon") == 0){
                    String continent;
                    boolean wingsClipped = false;

					System.out.println("What continent does " + name + " live in?");
					continent = myScanner.nextLine();

                    System.out.println("Is " + name + "'s wings clipped? (y/n)");
                    temp = myScanner.nextLine();
                    if (temp.compareTo("y") == 0)
                        wingsClipped = true;

					Animal newAnimal = new Falcon(name, gender, continent, wingsClipped);
				    animals = addAnimal(newAnimal, animals);	
				}

                /* adding a penguin */
				else if(animalType.compareTo("penguin") == 0){
                    boolean hasLaidEggs = false;
                    boolean isCarryingEgg = false;

                    System.out.println("Has " + name + " laid eggs? (y/n)");
                    temp = myScanner.nextLine();
                    if (temp.compareTo("y") == 0)
                        hasLaidEggs = true;

                    System.out.println("Is " + name + " carrying an egg? (y/n)");
                    temp = myScanner.nextLine();
                    if (temp.compareTo("y") == 0)
                        isCarryingEgg = true;

					Animal newAnimal = new Penguin(name, gender, hasLaidEggs, isCarryingEgg);
					animals = addAnimal(newAnimal, animals);
				}

                /* adding a turtle */
				else if(animalType.compareTo("turtle") == 0){
                    boolean hasLaidEggs = false;
                    boolean isLandBased = false;
                    
                    System.out.println("Has " + name + " laid eggs? (y/n)");
                    temp = myScanner.nextLine();
                    if (temp.compareTo("y") == 0)
                        hasLaidEggs = true;

                    System.out.println("Is " + name + " land based? (y/n)");
                    temp = myScanner.nextLine();
                    if (temp.compareTo("y") == 0)
                        isLandBased = true;

					Animal newAnimal = new Turtle(name, gender, hasLaidEggs, isLandBased);
					animals = addAnimal(newAnimal, animals);
				}

                /* adding an alligator */
				else if(animalType.compareTo("alligator") == 0){
                    boolean isMother = false;
                    String tailLength;

                    System.out.println("Is " + name + " a mother? (y/n)");
                    temp = myScanner.nextLine();
                    if (temp.compareTo("y") == 0)
                        isMother = true;

                    System.out.println("How long is " + name + "'s tail?");
                    tailLength = myScanner.nextLine();

					Animal newAnimal = new Alligator(name, gender, isMother, tailLength);
					animals = addAnimal(newAnimal, animals);
				}

				else {
					System.out.println("Invalid Animal Type");
				}
                
            /* delete functionality */
            } else if (option.compareTo("delete") == 0){
                System.out.println("Animal name: ");
                String name = myScanner.nextLine();

                animals = deleteAnimal(name, animals);

            /* display functionality */
            } else if (option.compareTo("display") == 0){
                printSummary(animals);
                System.out.println();
                printVerboseList(animals);
                System.out.println();

                System.out.println("What animal would you like to display information about?");
                String name = myScanner.nextLine();

                displayInfo(animals, name);

            /* exit */
            } else if (option.compareTo("exit") == 0) {
                System.out.println("bye");
                break;

            /* invalid option */
            } else {
                System.out.println("Try again");
            }
        }
        return;
    }
}
