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
public class learning15 {
   

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Введите число ");
      int cifra = input.nextInt();
        int x;
        for (x = 1; x < 11; x++){        
        System.out.print("Результат " + cifra + " * "+ x + " = " + cifra*x + " \n");
        }
        
        // TODO code application logic here
    }
    
}
