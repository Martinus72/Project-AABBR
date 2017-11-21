package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        init();

    }

    public static void init(){

        // Création de l'arbre à arbe binaire de recherches à Rebours
        AABRR aabrr = new AABRR();

        // Initialisation de la variable du menu
        int menuChoix = 0;

        Scanner scanner = new Scanner(System.in);

        while(menuChoix!=10){

            // Affichage du menu
             System.out.println(" ------------------------------------------------------------- \n \n" +
                                "                       Gestionnaire AABRR                      \n \n" +
                                " 1) Réaliser un arbre à partir d'un fichier texte \n" +
                                " 2) Réaliser un AABRR Aléatoire \n" +
                                " 10) Quitter l'application \n \n" +
                                " ------------------------------------------------------------- \n \n \n" +
                                " Choix : ");

             //Lecture de la réponse
             try {

                 menuChoix = scanner.nextInt();

             } catch(InputMismatchException e){

                 System.out.println(" Merci d'indiquer uniquement un des choix du menu");
             }

             switch (menuChoix){
                 case 1 :
                     creerAABRRviaFichier(aabrr);
                     break;
                 case 2 :
                     creerAABRRAleatoire(aabrr);
                     break;
             }
        }

        System.out.println("\n L'application a été fermée");

    }

    public static void creerAABRRviaFichier(AABRR aabrr){

        boolean stop = false;

    }

    public static void creerAABRRAleatoire(AABRR aabrr){

    }
}
