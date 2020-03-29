
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
public class learning20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         System.out.println("Введите число А ");
         int  a;
         int  b;
         int c = 0;
         a = input.nextInt();
         System.out.println("Введите число Б ");
         b=input.nextInt();
         c=a;
         a=b;
         b=c;
                 ;
         System.out.println("Теперь число А = "+a+ " Теперь число Б = "+b);
        // TODO code application logic here
    }
    
}
