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
public class learning12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int a;
    String day = null;
   
      switch(a=input.nextInt()) {
        case 1:
        day="Понедельник";
        break;
        case 2:
        day="Вторник";
        break;
        case 3:
        day="Среда";
        break;
        case 4:
        day="Четвер";
        break;
        case 5:
        day="Пятница";
        break;
        case 6:
        day="субботв";
        break;
        case 7:
        day="Воскресенье";
        break;
        default:
        a=0;
       
    
    }
    System.out.println(day);
    
        // TODO code application logic here
    }

    private static void Switch(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
