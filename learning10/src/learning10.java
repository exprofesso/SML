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
public class learning10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
float a;
float b;        
    Scanner input = new Scanner(System.in);  
System.out.println("Напишите сколько метров вы прошли ");
    a=input.nextFloat();
b=a/1000;

System.out.println("Вы прошли " +b+ " километров");
        // TODO code application logic here
    }
    
}
