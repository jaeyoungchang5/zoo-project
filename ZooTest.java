public class ZooTest {
    public static void main (String[] args){
        Mammal jeff = new Mammal("Jeff", true);
        
        System.out.println(jeff.getUniqueName() + " is his name");
        if (jeff.getEatsMeat()){
            System.out.println("He eats");
        } else {
            System.out.println("He don't eats");
        }
    }
}