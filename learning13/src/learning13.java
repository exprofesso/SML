/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author podkolzinsergey
 */

import java.util.Scanner;
public class learning13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.println("Введите свой текст: ");
         String text;
         String bukva;
         char bukva_char;
         int kol=0;
         text = input.nextLine();
         System.out.println("Введите букву: ");
         bukva = input.nextLine();
         bukva_char=bukva.charAt(0);
     for(int x=0; x < text.length(); x++){
         if(bukva_char==text.charAt(x))
         {
         kol++;    
         }
    }
         System.out.println(kol);
         
         
         
        // TODO code application logic here
    }
    
}
