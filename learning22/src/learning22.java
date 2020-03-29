
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
import java.util.Scanner;
public class learning22 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
    int x;
    int y;
    int i;
    int j;
    System.out.println("ВВедите два числа");
    x=input.nextInt();
    y=input.nextInt();
    for(i=1; i<=x; i++)
    {    
    for(j=1; j<=y-1; j++)
    {
    System.out.print("*");
    }
    System.out.println("*");
    }
    
    
    }
        // TODO code application logic here
    
    
}
