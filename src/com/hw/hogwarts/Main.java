package com.hw.hogwarts;

public class Main {
    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor("Harry Potter", 100, 100, 100, 100, 60);
        Griffindor hermioneGranger = new Griffindor("Hermione Granger", 90, 80, 100, 50, 90);
        Griffindor ronUizly = new Griffindor("Ron Uizly", 55, 66, 60, 80, 40);

        Hufflepuff zaharijaSmith = new Hufflepuff("Zaharija Smith", 75, 76, 74,73,72);
        Hufflepuff sedricDiggory = new Hufflepuff("Sedric Diggory", 65, 66, 64,63,62);
        Hufflepuff justinFinchFlechly = new Hufflepuff("Justin Finch-Flechly", 55, 56, 54,53,52);

        Ravenclaw chghouChang = new Ravenclaw("Chghou Chang", 70, 70, 70, 70, 70, 70);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 71, 71, 71, 71, 71, 71);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 72, 72, 72, 60, 72, 72);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 90, 90, 90, 90, 90, 90, 90);
        Slytherin grahamMontegue = new Slytherin("Graham Montegue", 70, 60, 70, 80, 70, 80, 60);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 60, 60, 60, 60, 60, 60, 60);

        dracoMalfoy.compareScore(zaharijaSmith);
        harryPotter.compareScore(hermioneGranger);
        hermioneGranger.compareScore(dracoMalfoy);
        ronUizly.compareScore(justinFinchFlechly);
    }
}