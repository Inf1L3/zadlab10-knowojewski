/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package pl.edu.ur.oopl10;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class WprowadzZKonsoli {
    
    public static void wprowadzInt(){
        
	  Scanner input = new Scanner(System.in);
	  int i = 0;

	  System.out.println("Podaj liczbe calkowita: ");
	  i = input.nextInt();

	  try {
		  System.out.println(i);
	  } catch (ArrayIndexOutOfBoundsException e) {
		  System.out.println("Niepoprawny parametr");
	  }
    
    }
    
    public static void wprowadzChar(){
        
        Scanner input = new Scanner(System.in);
	  char z;
          System.out.println("Podaj znak ");
            z = input.next().charAt(0);
            
            try {
		  System.out.println(z);
	  } catch (StringIndexOutOfBoundsException e) {
		  System.out.println("Niepoprawny parametr");
	  }                 
    }
    
    public static void wprowadzString(){
        
        Scanner input = new Scanner(System.in);
	  String s;
          System.out.println("Podaj znak ");
            s = input.nextLine();
            
            try {
		  System.out.println (s);
	  } catch (StringIndexOutOfBoundsException e) {
		  System.out.println("Niepoprawny parametr");
	  }                 
    }
    
    public static void wprowadzDouble(){
        
	  Scanner input = new Scanner(System.in);
	  double index = 0;

	  System.out.println("Podaj liczbe zmiennoprzecinkowa: ");
	  index = input.nextDouble();

	  try {
		  System.out.println(index);
	  } catch (ClassCastException e) {
		  System.out.println("Niepoprawny parametr");
	  }
    
    }
}
