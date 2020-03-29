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
public class learning9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Введите 1 число: " );
        a=input.nextInt();
        System.out.println("Введите 2 число: " );
        b=input.nextInt();
        if(a>b){
        System.out.println("Больше");
        }
        if(a<b){
        System.out.println("Меньше");
        }
        if(a==b){
        System.out.println("Равно");
        }
        
    }
    
}
