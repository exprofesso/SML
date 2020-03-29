/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author podkolzinsergey
 */

import java.util.Random;
import java.util.Scanner;
public class learning28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    final Random random = new Random();
    int x=0;
    int y;
    int win=0;
    int loss=0;
    int draw=0;
    String play;
      System.out.println("Выберете свой вариант:");
    System.out.println( "Ножницы, Бумага или Камень ");
        for(int i=1; i<8; i++){
       switch(play=input.nextLine().toLowerCase()) {
        case "ножницы":
        x=1;
        break;
        case "бумага":
        x=2;
        break;
        case "камень":
        x=3;
        break;
           }
    y = random.nextInt(3) + 1;
   switch(y) {
        case 1:
        System.out.println("Выбор комьютера: Ножницы");
        break;
        case 2:
        System.out.println("Выбор комьютера: Бумага");
        break;
        case 3:
        System.out.println("Выбор комьютера: Камень");
        break;
   }
if((x==1)&&(y==1)){
    System.out.println("Ничья");
    draw++;
}
if((x==1)&&(y==2)){
    System.out.println("Победа");
    win++;
}
if((x==1)&&(y==3)){
System.out.println("Проиграл, давай еще раз ");
loss++;
    }
if((x==2)&&(y==1)){
System.out.println("Проиграл, давай еще раз ");
loss++;
    }
if((x==2)&&(y==2)){
    System.out.println("Ничья");
    draw++;
}
if((x==2)&&(y==3)){
    System.out.println("Победа");
    win++;
}
if((x==3)&&(y==1)){
    System.out.println("Победа");
    win++;
}
if((x==3)&&(y==2)){
System.out.println("Проиграл, давай еще раз ");
loss++;
    }
if((x==3)&&(y==3)){
    System.out.println("Ничья");
    draw++;
}
 System.out.println("");
    }
        System.out.println("Итог игры ");
        System.out.println("Победы "+win);
        System.out.println("Ничья "+draw);
        System.out.println("Проиграл "+loss);
       
        if(win>loss)
        {
        System.out.println("По итогам игр вы победили!!!");
        }
        if(win<loss)
        {
        System.out.println("По итогам игр вы проиграли!!!");
        }
        if(win==loss)
        {
        System.out.println("По итогам игр Ничья!!!");
        }
        
        
       
        
    }
    
}