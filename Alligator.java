class Alligator extends Reptile {
    boolean isMother;
    String tailLength;

    Alligator(String uniqueName, String gender, boolean isMother, String tailLength){
        super(uniqueName, "least concern", "alligator", gender, true, false);
        this.isMother = isMother;
        this.tailLength = tailLength;
    }

    void displaySpecialInfo(){
        System.out.println(this.uniqueName + " is a " + this.gender + " " + this.animalType + " that " + (this.isMother ? "is" : "is not") + " a mother and that has a " + this.tailLength + " foot tail.");
    }

    void setIsMother(boolean isMother){
        this.isMother = isMother;
    }
    void setTailLength(String tailLength){
        this.tailLength = tailLength;
    }

    boolean getIsMother() { return this.isMother; }
    String getTailLength() { return this.tailLength; }
}