
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
public class learning33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String str;
        String a = "а";
        String b = "б";
         System.out.println("Введите свой текст");
         str=input.nextLine().toLowerCase();
         
         if(str.indexOf(a)!=-1){
            if(str.indexOf(a)<str.indexOf(b)){
                  System.out.println("а встречается раньше ");
           }      
         }
         else{
              System.out.println(" Нет символа а ");
         }
          if(str.indexOf(b)!=-1){
             
             if(str.indexOf(a)>str.indexOf(b)){
              System.out.println(" б встречается раньше ");
             }     
          }
          else{
              System.out.println(" Нет символа б ");
       }
    }    
}
