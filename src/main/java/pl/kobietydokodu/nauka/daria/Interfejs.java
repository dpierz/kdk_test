package pl.kobietydokodu.nauka.daria;

import java.util.Scanner;

public class Interfejs {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Kot kot = new Kot();
        System.out.println("Podaj imię kota:");
        kot.setImie(userInput());
        System.out.println("Podaj imię opiekuna kota:");
        kot.setImieOpiekuna(userInput());
        System.out.println("Dziękuję za podanie inforacji o kocie o imieniu " +kot.getImie()+" i jego opiekunie o imieniu "+ kot.getImieOpiekuna()+".");
    }

    static String userInput() {
        return scanner.nextLine();
    }

}