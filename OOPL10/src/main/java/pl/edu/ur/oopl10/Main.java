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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int tab[] = {11,22,33,44,55};
	  Scanner input = new Scanner(System.in);
	  int i = -1;

	  System.out.println("Podaj parametr tablicy: ");
	  i = input.nextInt();

	  try {
		  System.out.println(tab[i]);
	  } catch (ArrayIndexOutOfBoundsException e) {
		  System.out.println("Podales parametr poza tablica. Rozmiar tablicy to: "+tab.length);
	  }
    }
    
}
