
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

public class learning36 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
     String str=input.nextLine();
    long count = str.codePoints().filter(Character::isDigit)
            .count();
        System.out.println(count);
    }
     
}
