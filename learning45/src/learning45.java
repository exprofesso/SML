

import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author podkolzinsergey
 */

public class learning45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";
        String eng = "abcdefghijklmnopqrstuvwxyz";
        String dig = "0123456789";
        String sum = rus+rus.toUpperCase()+eng+eng.toUpperCase()+dig;
        for(int i=0; i<=r.nextInt(100); i++){
        char c = sum.charAt(r.nextInt(sum.length()));
        System.out.print(c);
       
        }
        
    }
    
}
