
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
public class learning40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
     String str=input.nextLine();
    int cifra = 0;
     for(int i=0; i<=str.length()-1; i++){
         switch(str.charAt(i)){
             case '1':
             cifra+=1;
              break;
             case '2':
             cifra+=2;
              break;
             case '3':
             cifra+=3;
              break;
             case '4':
             cifra+=4;
              break;
             case '5':
             cifra+=5;
              break;
             case '6':
             cifra+=6;
              break;
             case '7':
             cifra+=7;
              break;
             case '8':
             cifra+=8;
              break;
             case '9':
             cifra+=9;
              break;
             default:
                 break;
         }
    /* if(str.charAt(i)=='1'){
      cifra+=1;
      }
     if(str.charAt(i)=='2'){
      cifra+=2;
     }
     if(str.charAt(i)=='3'){
      cifra+=3;
     }
     if(str.charAt(i)=='4'){
      cifra+=4;
     }
     if(str.charAt(i)=='5'){
      cifra+=5;
     }
     if(str.charAt(i)=='6'){
      cifra+=6;
     }
     if(str.charAt(i)=='7'){
      cifra+=7;
     }
     if(str.charAt(i)=='8'){
      cifra+=8;
     }
     if(str.charAt(i)=='9'){
      cifra+=9;
     } */
     } 
     System.out.println(cifra);
    }
    
}
