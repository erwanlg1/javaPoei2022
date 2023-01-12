package com.centraleNantes.poei2.ErwanExercice.Erwan_Exercice.src;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {

        int day;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Un chiffre entre 1 et 7");

        day = keyboard.nextInt();

        switch (day) {
            case 1 -> System.out.println("Lundi");
            case 2 -> System.out.println("Mardi");
            case 3 -> System.out.println("Mercredi");
            case 4 -> System.out.println("Jeudi");
            case 5 -> System.out.println("Vendredi");
            case 6 -> System.out.println("Samedi");
            case 7 -> System.out.println("Dimanche");
            default -> System.out.println("Ne correspond à aucun jours");
        }


        switch (day) {
            case 1:
                System.out.println("Lundi");
                break;

            case 2:
                System.out.println("Mardi");
                break;

            case 3:
                System.out.println("Mercredi");
                break;

            case 4:
                System.out.println("Jeudi");
                break;

            case 5:
                System.out.println("Vendredi");
                break;

            case 6:
                System.out.println("Samedi");
                break;

            case 7:
                System.out.println("Dimanche");
                break;

            default:
                System.out.println("Ne correspond à aucun jours");
        }
    }
}



