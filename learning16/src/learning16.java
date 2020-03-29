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
public class learning16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Введите пароль  ");
    String pass;
    pass = input.nextLine();
    while (!pass.equals("Password")){
    System.out.println("Ошибка - Пароль не верный ");
    pass = input.nextLine();
    }
    System.out.println("Доступ разрешен! "); 
   
   
    }
    
}
