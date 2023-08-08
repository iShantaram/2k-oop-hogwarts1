package com.hw.hogwarts;

public abstract class Hogwarts {
    private final String name;
    private int powerOfMagic;
    private int transgrassionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgrassionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgrassionDistance = transgrassionDistance;
    }

    public void compareScore(Hogwarts hogwarts) {
        // проверяем, что ученики с одного факультета
        if (this.getClass().equals(hogwarts.getClass())) {
            this.compareSpecificScore(hogwarts);
        } else {
            this.compareGeneralScore(hogwarts);
        }
    }

    private void compareGeneralScore(Hogwarts hogwarts) {
        int score = this.getPowerOfMagic() + this.getTransgrassionDistance() -
                hogwarts.getPowerOfMagic() - hogwarts.getTransgrassionDistance();
        if (score > 0) {
            System.out.println(this.getName() + " сильнее, чем " + hogwarts.getName());
        } else if (score < 0) {
            System.out.println(this.getName() + " слабее, чем " + hogwarts.getName());
        } else {
            System.out.println(this.getName() + " и " + hogwarts.getName() + " равны по силе");
        }
    }
    public abstract int calculateSpecificScore();

    private void compareSpecificScore (Hogwarts hogwarts) {
        int thisScore = this.calculateSpecificScore();
        int otherScore = hogwarts.calculateSpecificScore();

        if (thisScore > otherScore) {
            System.out.println(this.getName() + " лучший студент, чем " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(hogwarts.getName() + " лучший студент, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + hogwarts.getName() + " - студенты одинаковой успеваемости на факультете.");
        }
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgrassionDistance() {
        return transgrassionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgrassionDistance=" + transgrassionDistance +
                '}';
    }
}
