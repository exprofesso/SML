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
public class learning17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int day;
    int week;
    int month;
    int year;
    Scanner input = new Scanner (System.in);
    System.out.println("Введите количество недель:  ");
    week=input.nextInt();
    System.out.println("Введите количество месяцев: ");
    month=input.nextInt();
    System.out.println("Введите количество лет: ");
    year=input.nextInt();
    day=7*week+30*month+365*year;
    System.out.println("Всего дней: " +day);
        // TODO code application logic here
    }
    
}
