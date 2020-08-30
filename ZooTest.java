import java.util.Scanner;

public class ZooTest {
    static Animal[] setupAnimals(){
        Animal[] animals = new Animal[6];
        animals[0] = new Wolf("Akela", "least concern", "Indian Wolf", "Male", true, true, true, true);
        animals[1] = new Falcon("Millenium", "least concern", "Falcon", "Male", true, true, "North America", false);
        animals[2] = new Turtle("Crush", "endangered", "Sea Turtle", "Male", true, true, true, true);
        animals[3] = new Lion("Nala", "vulnerable", "South African Lion", "Female", true, true, false, true);
        animals[4] = new Penguin("Kowalski", "near threatened", "Adelie Penguin", "Male", false, false, false, false);
        animals[5] = new Alligator("Swampy", "least concern", "American Alligator", "Male", true, false, false);
        printNames(animals);
        printSummary(animals);
        return animals;
    }

    static Animal[] addAnimal(Animal newAnimal, Animal[] animals){
        Animal[] newAnimals = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; i++){
            newAnimals[i] = animals[i];
        }
        newAnimals[animals.length] = newAnimal;

        printSummary(newAnimals);
        return newAnimals;
    }

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

    static void printNames(Animal[] animals) {
        System.out.println();
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i].getUniqueName());
        }
        System.out.println();
    }

    static void printSummary(Animal[] animals) {
        System.out.println();
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i].getUniqueName() + " is a " + animals[i].getGender() + " " + animals[i].getAnimalType() + ", whose conservation status is " + animals[i].getConservationStatus());
        }
        System.out.println();
    }

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

        while (true){
            printOptions();
            String option = myScanner.nextLine();

            if (option.compareTo("add") == 0){
				System.out.println("You can add a: wolf, lion, falcon, penguin, turtle, or aligator");
                System.out.println("Animal name: ");
                String name = myScanner.nextLine();
                System.out.println("Animal type: ");
                String animalType = myScanner.nextLine();
                System.out.println("Animal gender: ");
                String gender = myScanner.nextLine();
                if (animalType.compareTo("wolf") == 0){
                    Animal newAnimal = new Wolf(name, "least concern", "Indian Wolf", gender, true, true, true, true);
                    animals = addAnimal(newAnimal, animals);
                }
				else if (animalType.compareTo("lion") == 0){
					Animal newAnimal = new Lion(name, "vulnerable", "South African Lion", gender, true, true, false, true);
					animals = addAnimal(newAnimal, animals);
				}
				else if(animalType.compareTo("falcon") == 0){
					System.out.println("Falcon continent: ");
					String continent = myScanner.nextLine();
					Animal newAnimal = new Falcon(name, "least concern", "Falcon", gender, true, true, continent, false);
				    animals = addAnimal(newAnimal, animals);	
				}
				else if(animalType.compareTo("penguin") == 0){
					Animal newAnimal = new Penguin(name, "near threatened", "Adelie Penguin", gender, false, false, false, false);
					animals = addAnimal(newAnimal, animals);
				}
				else if(animalType.compareTo("turtle") == 0){
					Animal newAnimal = new Turtle(name, "endangered", "Sea Turtle", gender, true, true, true, true);
					animals = addAnimal(newAnimal, animals);
				}
				else if(animalType.compareTo("alligator") == 0){
					Animal newAnimal = new Alligator(name, "least concern", "American Alligator", gender, true, false, false);
					animals = addAnimal(newAnimal, animals);
				}
				else{
					System.out.println("Try Again -- Not A Valid Animal Type");
				}
            } else if (option.compareTo("delete") == 0){
                System.out.println("Animal name: ");
                String name = myScanner.nextLine();
                animals = deleteAnimal(name, animals);
            } else if (option.compareTo("display") == 0){
                printSummary(animals);
            } else if (option.compareTo("exit") == 0) {
                System.out.println("bye");
                break;
            } else {
                System.out.println("Try again");
            }
        }
        return;
    }
}
