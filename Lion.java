class Lion extends Mammal {
    boolean hasCubs;
    boolean isNapping;

    Lion(String uniqueName, String conservationStatus, String animalType, String gender, boolean eatsMeat, boolean potentiallyDeadly, boolean hasCubs, boolean isNapping){
        super(uniqueName, conservationStatus, animalType, gender, eatsMeat, potentiallyDeadly);
        this.hasCubs = hasCubs;
        this.isNapping = isNapping;
    }

    void setHasCubs(boolean hasCubs){
        this.hasCubs = hasCubs;
    }
    void setIsNapping(boolean isNapping){
        this.isNapping = isNapping;
    }

    boolean getHasCubs() { return this.hasCubs; }
    boolean getIsNapping() { return this.isNapping; }
}