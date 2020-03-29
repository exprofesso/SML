
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author podkolzinsergey
 */
public class learning35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
     String str=input.nextLine();
     StringBuffer sb = new StringBuffer(str.subSequence(0, str.length()));
      for(int i=3; i<str.length()-1; i+=4){
       if(sb.charAt(i)!='o'){
        sb.replace(i, i+1, "*");
       }
      }
      System.out.println(sb);
    
   }   
     
       
    
    
}
