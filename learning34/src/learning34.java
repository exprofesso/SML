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
public class learning34 {

 
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       String text;
       text=input.nextLine();
       text=text.replaceAll("хуй|хуя","***");
       text=text.replaceAll("пизда","*****");
           System.out.println(text);
      
         
        
    }
    
}
