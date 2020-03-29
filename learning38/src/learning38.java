
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
public class learning38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
     String str=input.nextLine();
     if(str.contains("Лукашенко")){
           System.out.println(str.replaceAll("Лукашенко","Батька"));
       }
      
    }
    
}
