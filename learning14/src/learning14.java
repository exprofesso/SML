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
public class learning14 {
    

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    System.out.println("какой будет массив?: ");
    int size = input.nextInt();
    float array[] = new float[size];
    System.out.println("Какие цифры там будут?: ");
    for (int i = 0; i < size; i++) {
        array[i] = input.nextFloat(); 
    }
    float sum = 0;
    System.out.print ("Вот ваше среднее число: ");
    for (int i = 0; i < size; i++)
     sum=sum+array[i];
             
    sum=sum/size;
        System.out.println (sum);
    
    
}
    
}
