abstract class Mammal extends Animal {
    boolean eatsMeat;
    boolean potentiallyDeadly;

    Mammal(String uniqueName, String conservationStatus, String animalType, String gender, boolean eatsMeat, boolean potentiallyDeadly){
        super(uniqueName, conservationStatus, animalType, gender);
        this.eatsMeat = eatsMeat;
        this.potentiallyDeadly = potentiallyDeadly;
    }

    final void setEatsMeat(boolean eatsMeat){
        this.eatsMeat = eatsMeat;
    }
    final void setPotentiallyDeadly(boolean potentiallyDeadly){
        this.potentiallyDeadly = potentiallyDeadly;
    }

    final boolean getEatsMeat() { return this.eatsMeat; }
    final boolean getPotentiallyDeadly() { return this.potentiallyDeadly; }
}