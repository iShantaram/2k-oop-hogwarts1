package com.hw.hogwarts;

public class Griffindor extends Hogwarts {
    private int honor;
    private int nobility;
    private int courage;

    public Griffindor(String name, int powerOfMagic, int transgrassionDistance, int honor, int nobility, int courage) {
        super(name, powerOfMagic, transgrassionDistance);
        this.honor = honor;
        this.nobility = nobility;
        this.courage = courage;
    }

    @Override
    public int calculateSpecificScore() {
        return getCourage() + getHonor() + getNobility();
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "honor=" + honor +
                ", nobility=" + nobility +
                ", courage=" + courage +
                "} " + super.toString();
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }

    public int getCourage() {
        return courage;
    }
}
