package com.hw.hogwarts;

public class Hufflepuff extends Hogwarts {
    private int deligence;
    private int loyalty;
    private int honor;

    public Hufflepuff(String name, int powerOfMagic, int transgrassionDistance, int deligence, int loyalty, int honor) {
        super(name, powerOfMagic, transgrassionDistance);
        this.deligence = deligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    @Override
    public int calculateSpecificScore() {
        return getDeligence() + getHonor() + getLoyalty();
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "deligence=" + deligence +
                ", loyalty=" + loyalty +
                ", honor=" + honor +
                "} " + super.toString();
    }

    public int getDeligence() {
        return deligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonor() {
        return honor;
    }
}
