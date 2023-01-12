package com.centraleNantes.poei2.ErwanExercice.Erwan_Exercice.src;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {

        String langue[][] = {{"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"}, {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}};

        Scanner scanner = new Scanner(System.in);

        System.out.println("FR: 1 EN  2");
        int langueChoice = scanner.nextInt();

        System.out.println("Choisir un jour");
        ;
        int dayChoice = scanner.nextInt();


        if (langueChoice == 1) {

            if (dayChoice < 7) {

                System.out.println(langue[0][dayChoice]);
            } else {
                System.out.println("Le jour n'existe pas");
            }


        } else if (langueChoice == 2) {

            if (dayChoice < 7) {
                System.out.println(langue[1][dayChoice]);
            } else {
                System.out.println("Le jour n'existe pas");
            }
        } else {
            System.out.println("Cette langue n'existe pas");
        }
    }
}
