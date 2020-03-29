
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
public class learning26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
        double x;
        int y;
        y=input.nextInt();
        for(x=1; x<=y; x=(float) (x+0.2)){
           System.out.printf("%4.1f", x);
        }
    }
    
}
