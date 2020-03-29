
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
public class learning37 {

    public static void main(String[] args) {

  Scanner input = new Scanner (System.in);
     String str=input.nextLine();
     for(int i=0; i<str.length(); i++){
     if ((str.charAt(i)!='а')&(str.charAt(i)!='б')&(str.charAt(i)!='в')){
         System.out.print("нет");
         break;
                 }
     }
     
    }
    
}
