
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
public class learning24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        int x;
        int y;
        y=input.nextInt();
        for(x=1000; x<=y+1000; x++){
            
           System.out.print(x+",");
        }
       
        
       
    }
    
}
