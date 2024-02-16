package PoupeeRussePack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Donner la taille de la première poupée: ");
        int taille1 = scanner.nextInt();
        System.out.print("Donner la taille de la deuxième poupée: ");
        int taille2 = scanner.nextInt();
        
        Poupee poupee1 = new PoupeeRusse(taille1);
        Poupee poupee2 = new PoupeeRusse(taille2);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ouvrir la poupée");
            System.out.println("2. Fermer la poupée");
            System.out.println("3. Placer une poupée à l'intérieur d'une autre");
            System.out.println("4. Retirer une poupée de l'intérieur d'une autre");
            System.out.println("5. Quitter");
            System.out.print("\nChoix: ");
            int choix = scanner.nextInt();
            
            switch (choix) {
                case 1:
                    System.out.print("Donner la taille de la poupée à ouvrir: ");
                    int tailleOuvrir = scanner.nextInt();
                    if (tailleOuvrir == taille1) {
                        poupee1.ouvrir();
                    } else if (tailleOuvrir == taille2) {
                        poupee2.ouvrir();
                    } else {
                        System.out.println("Aucune poupée de cette taille.");
                    }
                    break;
                case 2:
                    System.out.print("Donner la taille de la poupée à fermer: ");
                    int tailleFermer = scanner.nextInt();
                    if (tailleFermer == taille1) {
                        poupee1.fermer();
                    } else if (tailleFermer == taille2) {
                        poupee2.fermer();
                    } else {
                        System.out.println("Aucune poupée de cette taille.");
                    }
                    break;
                case 3:
                    System.out.print("Donner la taille de la poupée à placer: ");
                    int taillePlacer = scanner.nextInt();
                    System.out.print("Donner la taille de la poupée où placer: ");
                    int taillePlacerDans = scanner.nextInt();
                    if (taillePlacer == taille1) {
                        poupee1.placerDans(taillePlacerDans == taille1 ? poupee1 : poupee2);
                    } else if (taillePlacer == taille2) {
                        poupee2.placerDans(taillePlacerDans == taille1 ? poupee1 : poupee2);
                    } else {
                        System.out.println("Aucune poupée de cette taille.");
                    }
 
                    break;
                case 4:
                    System.out.print("Donner la taille de la poupée à retirer: ");
                    int tailleRetirer = scanner.nextInt();
                    System.out.print("Donner la taille de la poupée où retirer: ");
                    int tailleRetirerDe = scanner.nextInt();
                    if (tailleRetirer == taille1) {
                        poupee1.sortirDe(tailleRetirerDe == taille1 ? poupee1 : poupee2);
                    } else if (tailleRetirer == taille2) {
                        poupee2.sortirDe(tailleRetirerDe == taille1 ? poupee1 : poupee2);
                    } else {
                        System.out.println("Aucune poupée de cette taille.");
                    }
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }
     
    }
    
}