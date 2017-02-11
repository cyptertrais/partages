/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

/**
 *
 * @author Famille
 */
public class Carte {

int valeur;
String couleur;
Carte(int v,String c){
    valeur=v;
    couleur=c;
}
public  String toString(){
  if(valeur==0){
      if(couleur.equals("0")){
          return "AS de Coeur";
      }
      if(couleur.equals("1")){
          return "AS de Carreau";
      }
      if(couleur.equals("2")){
          return "AS de Tréfle";
      }
      if(couleur.equals("3")){
          return "AS de Pic";
      }
      
      
  }

    if(valeur==1){
      if(couleur.equals("0")){
          return "2 de Coeur";
      }
      if(couleur.equals("1")){
          return "2 de Carreau";
      }
      if(couleur.equals("2")){
          return "2 de Tréfle";
      }
      if(couleur.equals("3")){
          return "2 de Pic";
      }
      
      
  }
    if(valeur==2){
      if(couleur.equals("0")){
          return "3 de Coeur";
      }
      if(couleur.equals("1")){
          return "3 de Carreau";
      }
      if(couleur.equals("2")){
          return "3 de Tréfle";
      }
      if(couleur.equals("3")){
          return "3 de Pic";
      }
      
      
  }
    if(valeur==3){
      if(couleur.equals("0")){
          return "4 de Coeur";
      }
      if(couleur.equals("1")){
          return "4 de Carreau";
      }
      if(couleur.equals("2")){
          return "4 de Tréfle";
      }
      if(couleur.equals("3")){
          return "4 de Pic";
      }
      
      
  }
    if(valeur==4){
      if(couleur.equals("0")){
          return "5 de Coeur";
      }
      if(couleur.equals("1")){
          return "5 de Carreau";
      }
      if(couleur.equals("2")){
          return "5 de Tréfle";
      }
      if(couleur.equals("3")){
          return "5 de Pic";
      }
      
      
  }
    if(valeur==5){
      if(couleur.equals("0")){
          return "6 de Coeur";
      }
      if(couleur.equals("1")){
          return "6 de Carreau";
      }
      if(couleur.equals("2")){
          return "6 de Tréfle";
      }
      if(couleur.equals("3")){
          return "6 de Pic";
      }
      
      
  }
     if(valeur==6){
      if(couleur.equals("0")){
          return "7 de Coeur";
      }
      if(couleur.equals("1")){
          return "7 de Carreau";
      }
      if(couleur.equals("2")){
          return "7 de Tréfle";
      }
      if(couleur.equals("3")){
          return "7 de Pic";
      }
      
      
  }
      if(valeur==7){
      if(couleur.equals("0")){
          return "8 de Coeur";
      }
      if(couleur.equals("1")){
          return "8 de Carreau";
      }
      if(couleur.equals("2")){
          return "8 de Tréfle";
      }
      if(couleur.equals("3")){
          return "8 de Pic";
      }
      
      
  }
       if(valeur==8){
      if(couleur.equals("0")){
          return "9 de Coeur";
      }
      if(couleur.equals("1")){
          return "9 de Carreau";
      }
      if(couleur.equals("2")){
          return "9 de Tréfle";
      }
      if(couleur.equals("3")){
          return "9 de Pic";
      }
      
      
  }
          if(valeur==9){
      if(couleur.equals("0")){
          return "10 de Coeur";
      }
      if(couleur.equals("1")){
          return "10 de Carreau";
      }
      if(couleur.equals("2")){
          return "10 de Tréfle";
      }
      if(couleur.equals("3")){
          return "10 de Pic";
      }
      
      
  }
             if(valeur==10){
      if(couleur.equals("0")){
          return "Valet de Coeur";
      }
      if(couleur.equals("1")){
          return "Valet de Carreau";
      }
      if(couleur.equals("2")){
          return "Valet de Tréfle";
      }
      if(couleur.equals("3")){
          return "Valet de Pic";
      }
      
      
  }
             if(valeur==11){
      if(couleur.equals("0")){
          return "Dame de Coeur";
      }
      if(couleur.equals("1")){
          return "Dame de Carreau";
      }
      if(couleur.equals("2")){
          return "Dame de Tréfle";
      }
      if(couleur.equals("3")){
          return "Dame de Pic";
      }
      
      
  }
             if(valeur==12){
      if(couleur.equals("0")){
          return "Roi de Coeur";
      }
      if(couleur.equals("1")){
          return "Roi de Carreau";
      }
      if(couleur.equals("2")){
          return "Roi de Tréfle";
      }
      if(couleur.equals("3")){
          return "Roi de Pic";
      }
      
      
  }
  return "erreur";  
    
}
public static Carte[] generejeu(){
    Carte[] c= new Carte[52];
    int num=0;
    for(int i=0;i<13;i++){
        for(int j=0;j<4;j++){
         c[num]= new Carte(i,String.valueOf(j));
         num++;
        }
    }
    
    return c;
}
// retourne true si la carte passé en parametre est plus faible
public  boolean bataille(Carte c){
    if(c.valeur==0 && valeur>0){
        return false;
    }
    if(valeur>c.valeur || (valeur==0 && c.valeur>0)){
        return true;
    }
    
    if(valeur==c.valeur && couleur.charAt(0)<c.couleur.charAt(0)){
    return false;
    }
    return false;
}
}
