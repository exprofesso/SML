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
public class learning11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     int a;
     int b;
     System.out.println("Какое число хотите возвести в степень? ");
     a=input.nextInt();
     System.out.println("В какую стень хотите возвести? ");
     b=input.nextInt();
     
     System.out.printf("Результат: %.0f \n", Math.pow(a, b));
     
        // TODO code application logic here
    }
    
}
