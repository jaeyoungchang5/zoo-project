class Lion extends Mammal {
    boolean hasCubs;
    boolean isNapping;

    Lion(String uniqueName, String gender, boolean hasCubs, boolean isNapping){
        super(uniqueName, "vulnerable", "lion", gender, true, true);
        this.hasCubs = hasCubs;
        this.isNapping = isNapping;
    }

    void displaySpecialInfo(){
        System.out.println(this.uniqueName + " is a " + this.gender + " " + this.animalType + " that " + (this.hasCubs ? "has" : "does not have") + " cubs and " + (this.isNapping ? "is" : "is not") + " currently napping.");
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