/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;
import java.util.*;
/**
 *
 * @author Famille
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    grille g= new grille();
    g.initgrille();
    Scanner s= new Scanner(System.in);
    boolean gg = false;
    System.out.println(g);
    while(!gg){
        String direction= s.nextLine();
        if(direction.equals("s")){
    for(int i=0;i<g.cases.length;i++){
        for(int j=0;j<g.cases[0].length;j++){
        if(g.prochain("s", i,j)>0){
    g.cases[g.prochain("s", i,j)][j]=g.cases[g.prochain("s", i,j)][j]*2;
    g.cases[i][j]=0;
    }
    }
    }
        }
        if(direction.equals("d")){
    for(int i=0;i<g.cases.length;i++){
        for(int j=0;j<g.cases[0].length;j++){
        if(g.prochain("d", i,j)>0){
    g.cases[i][g.prochain("d", i,j)]=g.cases[i][g.prochain("d", i,j)]*2;
    g.cases[i][j]=0;
    }
    }
    }
        }else{
          System.out.println("Mauvaise direction");  
        }
    System.out.println(g);
    }
}
    
}
