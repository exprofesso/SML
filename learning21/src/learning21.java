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
public class learning21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String cifra="00000";
        int size;
        System.out.println("Введите сколько раз хотите");
        size=input.nextInt();
        for(int i=1; i<=size; i++){
         System.out.println(cifra);
        }
       
    }
    
}
