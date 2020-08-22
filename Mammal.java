class Mammal extends Animal {
    boolean eatsMeat;

    Mammal(String uniqueName, boolean eatsMeat){
        super(uniqueName);
        this.eatsMeat = eatsMeat;
    }

    void setEatsMeat(boolean eatsMeat){
        this.eatsMeat = eatsMeat;
    }

    boolean getEatsMeat() { return this.eatsMeat; }
}