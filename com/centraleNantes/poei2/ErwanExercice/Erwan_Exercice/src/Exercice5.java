package com.centraleNantes.poei2.ErwanExercice.Erwan_Exercice.src;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {

        String langue[][] = {{"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"}, {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}};

        Scanner scanner = new Scanner(System.in);

        System.out.println("FR: 1  EN: 2");
        int langueChoice = scanner.nextInt();

        System.out.println("Choisir un jour");
        int dayChoice = scanner.nextInt();



            System.out.println(langue[langueChoice][dayChoice]);

    }
    }

