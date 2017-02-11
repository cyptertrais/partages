/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;
import java.util.*;
import java.awt.event.KeyEvent;
/**
 *
 * @author Famille
 */
public class Jeu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand=new Random();
        Carte[] c = Carte.generejeu();
        Scanner s= new Scanner(System.in);
        System.out.println("Entrez votre prenom J1");
        Joueur j1= new Joueur(s.nextLine());
        int choix1;
        System.out.println("Entrez votre prenom J2");
        Joueur j2= new Joueur(s.nextLine());
        int choix2;
        System.out.println("Appuyez sur 1 pour jouer");
        int jouer=s.nextInt();
        int nbtirage=20;

        if(jouer==1){
            int cpt=0;
            while(cpt<nbtirage){
                choix2= rand.nextInt(52);
                choix1= rand.nextInt(52);

        
        System.out.println(j1.prenom+" vous avez la carte ==> "+ c[choix1] );
        System.out.println(j2.prenom+" vous avez la carte ==> "+ c[choix2] );
        if(c[choix1].bataille(c[choix2])){
        System.out.println("Le joueur 1 gagne");
        j1.score++;
        }else{
        System.out.println("Le joueur 2 gagne");
        j2.score++;
        }
        cpt++;
            }
        }else{
        System.out.println("Vous avez pas joué");

        }
    }
    
}
