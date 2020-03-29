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
public class learning7 {

    
    public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 String backwards;
 

  System.out.println("Напишите текст ");
backwards=input.nextLine(); 
StringBuffer sbf = new StringBuffer(backwards);
    System.out.println(sbf.reverse());
        
    }
    
}
