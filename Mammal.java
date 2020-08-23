class Mammal extends Animal {
    boolean eatsMeat;
    boolean potentiallyDeadly;

    Mammal(String uniqueName, String conservationStatus, String animalType, String gender, boolean eatsMeat, boolean potentiallyDeadly){
        super(uniqueName, conservationStatus, animalType, gender);
        this.eatsMeat = eatsMeat;
        this.potentiallyDeadly = potentiallyDeadly;
    }

    void setEatsMeat(boolean eatsMeat){
        this.eatsMeat = eatsMeat;
    }
    void setPotentiallyDeadly(boolean potentiallyDeadly){
        this.potentiallyDeadly = potentiallyDeadly;
    }

    boolean getEatsMeat() { return this.eatsMeat; }
    boolean getPotentiallyDeadly() { return this.potentiallyDeadly; }
}