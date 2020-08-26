class Wolf extends Mammal {
    boolean canHowl;
    boolean isInPack;

    Wolf(String uniqueName, String conservationStatus, String animalType, String gender, boolean eatsMeat, boolean potentiallyDeadly, boolean canHowl, boolean isInPack){
        super(uniqueName, conservationStatus, animalType, gender, eatsMeat, potentiallyDeadly);
        this.canHowl = canHowl;
        this.isInPack = isInPack;
    }

    void setCanHowl(boolean canHowl){
        this.canHowl = canHowl;
    }
    void setIsInPack(boolean isInPack){
        this.isInPack = isInPack;
    }

    boolean getCanHowl() { return this.canHowl; }
    boolean getIsInPack() { return this.isInPack; }
}