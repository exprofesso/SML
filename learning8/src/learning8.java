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
public class learning8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    String text="";
    String Backwards;
    System.out.println();
    Backwards=input.nextLine();
    for(int i=Backwards.length()-1; i>-1; i--){
    text=text+Backwards.charAt(i);
    }
    
    System.out.println(text);
    
        
        // TODO code application logic here
    }
    
}
