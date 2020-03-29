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
public class learning31 {

    
    public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
        String str;
        System.out.println("Введите свой текст");
         str=input.nextLine().toLowerCase();
        int lastPos = str.length()-1;
        char c = str.charAt(lastPos);
        for (int i = 0; i < lastPos+1; i++) {
            if (str.charAt(i) == c) {
                System.out.println(i+1);
            }
        }
    } 
}
