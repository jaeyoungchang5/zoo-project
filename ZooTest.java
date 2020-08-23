public class ZooTest {
    public static void main (String[] args){
        Mammal jeff = new Mammal("Jeff", "Endangered", "Lion", "Male", true, true);
        Reptile croc = new Reptile("Croc", "Thriving", "Alligator", "Female", true, false);
        Bird oscar = new Bird("Oscar", "Doing well", "Penguin", "Male", false, false);
        
        System.out.println(jeff.getUniqueName() + " is the name");
        if (jeff.getGender() == "Male"){
            System.out.print("He");
        } else if (jeff.getGender() == "Female"){
            System.out.print("She");
        }
        if (jeff.getEatsMeat()){
            System.out.println(" eats");
        } else {
            System.out.println(" eats");
        }

        System.out.println(croc.getUniqueName() + " is the name");
        if (croc.getGender() == "Male"){
            System.out.print("He");
        } else if (croc.getGender() == "Female"){
            System.out.print("She");
        }
        if (croc.getResurfaceToBreath()){
            System.out.println(" resurfaces to breath");
        } else {
            System.out.println(" breathes underwater");
        }

        System.out.println(oscar.getUniqueName() + " is the name");
        if (oscar.getGender() == "Male"){
            System.out.print("He");
        } else if (oscar.getGender() == "Female"){
            System.out.print("She");
        }
        if (oscar.getCanFly()){
            System.out.println(" can fly");
        } else {
            System.out.println(" can't fly");
        }
    }
}