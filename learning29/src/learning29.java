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
public class learning29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x;
        int y = 0;
        System.out.println("Попробуй угать каое число я загадал от 1 до 100 ");
        x=input.nextInt();
        
        while(x!=97)
        {
           x=input.nextInt();
        }  
        
        System.out.println("Yes!!!");
        
        // TODO code application logic here
    }
    
}
