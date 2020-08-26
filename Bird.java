abstract class Bird extends Animal {
    boolean hasTalons;
    boolean canFly;

    Bird(String uniqueName, String conservationStatus, String animalType, String gender, boolean hasTalons, boolean canFly){
        super(uniqueName, conservationStatus, animalType, gender);
        this.hasTalons = hasTalons;
        this.canFly = canFly;
    }

    void setHasTalons(boolean hasTalons){
        this.hasTalons = hasTalons;
    }
    void setCanFly(boolean canFly){
        this.canFly = canFly;
    }

    boolean getHasTalons() { return this.hasTalons; }
    boolean getCanFly() { return this.canFly; }
}