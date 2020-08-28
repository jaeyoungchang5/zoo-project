public class ZooTest {
    static void setupAnimals(){
        Animal[] animals = new Animal[6];
        animals[0] = new Wolf("Akela", "least concern", "Indian Wolf", "Male", true, true, true, true);
        animals[1] = new Falcon("Millenium", "least concern", "Falcon", "Male", true, true, "North America", false);
        animals[2] = new Turtle("Crush", "endangered", "Sea Turtle", "Male", true, true, true, true);
        animals[3] = new Lion("Nala", "vulnerable", "South African Lion", "Female", true, true, false, true);
        animals[4] = new Penguin("Kowalski", "near threatened", "Adelie Penguin", "Male", false, false, false, false);
        animals[5] = new Alligator("Swampy", "least concern", "American Alligator", "Male", true, false, false);
        printNames(animals);
        printSummary(animals);
    }

    static void printNames(Animal[] animals) {
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i].getUniqueName());
        }
    }

    static void printSummary(Animal[] animals) {
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i].getUniqueName() + " is a " + animals[i].getGender() + " " + animals[i].getAnimalType() + ", whose conservation status is " + animals[i].getConservationStatus());
        }
    }

    public static void main (String[] args){
        // Animal[] animals = new Animal[6];
        // animals[0] = new Wolf("Akela", "least concern", "Indian Wolf", "Male", true, true, true, true);
        // animals[1] = new Falcon("Millenium", "least concern", "Falcon", "Male", true, true, "North America", false);
        // animals[2] = new Turtle("Crush", "endangered", "Sea Turtle", "Male", true, true, true, true);
        // animals[3] = new Lion("Nala", "vulnerable", "South African Lion", "Female", true, true, false, true);
        // animals[4] = new Penguin("Kowalski", "near threatened", "Adelie Penguin", "Male", false, false, false, false);
        // animals[5] = new Alligator("Swampy", "least concern", "American Alligator", "Male", true, false, false);
        // printNames(animals);
        setupAnimals();
    }
}