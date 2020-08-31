class Wolf extends Mammal {
    boolean canHowl;
    boolean isInPack;

    Wolf(String uniqueName, String gender, boolean canHowl, boolean isInPack){
        super(uniqueName, "least concern", "wolf", gender, true, true);
        this.canHowl = canHowl;
        this.isInPack = isInPack;
    }

    void displaySpecialInfo(){
        System.out.println(this.uniqueName + " is a " + this.gender + " " + this.animalType + " that " + (this.canHowl ? "can" : "cannot") + " howl and " + (this.isInPack ? "is" : "is not") + " in a pack.");
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