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
public class learning18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int x;
      int i;
      x=input.nextInt();
      for(int y=x; y>=1; y--){
       for(i=y;i<=x; i++){
          System.out.print("0");
       }
       System.out.println("\n");
       }   
      }
    
    
}
