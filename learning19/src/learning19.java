
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
public class learning19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double celsei;
      double farengeit;
      Scanner input = new Scanner (System.in);
      System.out.println("Введите значение в Цельсиях ");
      celsei =input.nextDouble();
      farengeit=celsei*1.8+32;
      System.out.println("Ваш результат в Ференгейтах: "+farengeit);
      
        // TODO code application logic here
    }
    
}
