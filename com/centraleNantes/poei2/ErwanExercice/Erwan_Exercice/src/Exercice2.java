package com.centraleNantes.poei2.ErwanExercice.Erwan_Exercice.src;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {

        int day;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Un chiffre entre 1 et 7");

        day = keyboard.nextInt();

        if (day == 1) {
            System.out.println("Le jour de la semaine est : Lundi");
        }

        else if (day == 2) {
            System.out.println("Le jour de la semaine est : Mardi");
        }
        else if (day == 3) {
            System.out.println("Le jour de la semaine est : Mercredi");
        }
        else if (day == 4) {
            System.out.println("Le jour de la semaine est : Jeudi");
        }
        else if (day == 5) {
            System.out.println("Le jour de la semaine est : Vendredi");
        }
        else if (day == 6) {
            System.out.println("Le jour de la semaine est : Samedi");
        }
        else if (day == 7) {
            System.out.println("Le jour de la semaine est : Dimanche");
        }

        else {
            System.out.println("Ce n'est pas un jours de la semaine");
        }

    }
}