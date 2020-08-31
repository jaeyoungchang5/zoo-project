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
    abstract void displaySpecialInfo();

    final void setUniqueName(String uniqueName){
        this.uniqueName = uniqueName;
    }
    final void setConservationStatus(String conservationStatus){
        this.conservationStatus = conservationStatus;
    }
    final void setAnimalType(String animalType){
        this.animalType = animalType;
    }
    final void setGender(String gender){
        this.gender = gender;
    }

    final String getUniqueName() { return this.uniqueName; }
    final String getConservationStatus() { return this.conservationStatus; }
    final String getAnimalType() { return this.animalType; }
    final String getGender() { return this.gender; }
}
