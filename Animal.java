abstract class Animal {
    String uniqueName;
    String conservationStatus;
    String animalType;
    String gender;

    Animal(String uniqueName, String conservationStatus, String animalType, String gender){
        this.uniqueName = uniqueName;
        this.conservationStatus = conservationStatus;
        this.animalType = animalType;
        this.gender = gender;
    }
    // special display (abstract class) - something everybody does, but everybody does differently
    // abstract void setSpecialAttribute(String specialAttribute) {
    //     return;
    // }
    void setupAnimal(){
        System.out.println("What type of animal?");
    }

    void setUniqueName(String uniqueName){
        this.uniqueName = uniqueName;
    }
    void setConservationStatus(String conservationStatus){
        this.conservationStatus = conservationStatus;
    }
    void setAnimalType(String animalType){
        this.animalType = animalType;
    }
    void setGender(String gender){
        this.gender = gender;
    }

    String getUniqueName() { return this.uniqueName; }
    String getConservationStatus() { return this.conservationStatus; }
    String getAnimalType() { return this.animalType; }
    String getGender() { return this.gender; }
}
