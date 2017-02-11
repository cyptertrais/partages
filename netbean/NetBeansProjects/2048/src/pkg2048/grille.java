/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;

import java.util.Random;

/**
 *
 * @author Famille
 */
public class grille {
    int cases[][]=new int[4][4];;
    
    public  void initgrille(){
    Random rand = new Random();
        for(int i=0;i<cases.length;i++){
          for(int j=0;j<cases[0].length;j++){
          cases [i][j]=0;  
        } 
          
        }
       cases [3][1]=3;
       cases [1][1]=3;
       cases [3][3]=6;
       
}
    public   String toString(){
        String res="";
        for(int i=0;i<cases.length;i++){
          for(int j=0;j<cases[0].length;j++){
          res=res+String.valueOf(cases [i][j])+" ";  
        }
          res=res+"\n";
        }
        return res;
    }
    // retourne -1 si un nom dans la meme ligne et 0 si rien et 
    public int prochain(String d,int debuti,int debutj){
        if(cases[debuti][debutj]==0)return -2;
        if(d.equals("s")){
          for(int i=debuti;i<cases.length-1;i++){
          if(cases[debuti+i][debutj]==0){
              
          }
          if(cases[debuti+i][debutj]==cases[debuti][debutj]){
            return debuti+i;  
          }
          
        } 
        }
        if(d.equals("d")){
          for(int j=debutj;j<cases.length-1;j++){
          if(cases[debuti][debutj+j]==0){
              
          }
          if(cases[debuti][debutj+j]==cases[debuti][debutj]){
            return j+1;  
          }
          
        } 
        }
        return 0;
    }
}
