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
public class learning30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String thee_simvol;
        
        thee_simvol=input.nextLine();
        if(thee_simvol.length()-1<5){
          System.out.print(thee_simvol.substring(0,1)+""+thee_simvol.substring(0,1)+""+thee_simvol.substring(0,1)+""+thee_simvol.substring(0,1)+""+thee_simvol.substring(0,1));
        }
        else{
        System.out.println(thee_simvol.substring(0, 3)+""+thee_simvol.substring(thee_simvol.length()-3, thee_simvol.length()));
        }
        
     
    }
    
}
