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
public class learning32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        String str;
         System.out.println("Введите свой текст");
         str=input.nextLine();
         int number = str.length()-1;
         for(int i=2; i<=number; i=i+3){
             System.out.print(str.charAt(i));
         }
         
        // TODO code application logic here
    }
    
}
