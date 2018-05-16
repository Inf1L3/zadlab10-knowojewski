/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class Zadanie3 {
    
    public static void Zadanie3(){
                int a = 10;
		int b = 0;
		try {
			int dzielenie = a / b;
			System.out.println(dzielenie);
		} catch(ArithmeticException e) {
			System.err.println("Nie dzielimy przez 0!!!!");
		}
    }
}